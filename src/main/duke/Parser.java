package main.duke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Parser {
    protected String input;
    protected String[] text;
    protected String body;
    protected boolean isPending;
    protected boolean isTask;
    protected Task task;
    protected Scanner scan = new Scanner(System.in);
    private static ArrayList<Task> todoList = TaskList.getInstance().getList();

    public Parser() {
        this.isPending = true;
    }

    public void parse(String input) throws DukeException {
        this.text = input.split(" ");

        switch (text[0].toLowerCase()) {
            case "bye":
                this.setExit();
                this.isTask = false;
                break;
            case "list":
                this.printList();
                this.isTask = false;
                break;
            case "todo":
                this.body = String.join(" ", Arrays.copyOfRange(text, 1, text.length));
                try {
                    this.addTodo(this.body);
                    this.isTask = true;
                } catch (DukeException e) {
                    e.printErrorMessage();
                    this.isTask = false;
                }
                break;
            case "deadline":
                this.body = String.join(" ", Arrays.copyOfRange(text, 1, text.length-2));
                try {
                    this.addDeadline(this.body, text[text.length-1]);
                    this.isTask = true;
                } catch (DukeException e) {
                    e.printErrorMessage();
                    this.isTask = false;
                }
                break;
            case "event":
                this.body = String.join(" ", Arrays.copyOfRange(text, 1, text.length-2));
                try {
                    this.addEvent(this.body, text[text.length-2], text[text.length-1]);
                    this.isTask = true;
                } catch (DukeException e) {
                    e.printErrorMessage();
                    this.isTask = false;
                }
                break;
            default:
                this.body = "";
                this.isTask = false;
                throw new DukeException("\t☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }

    public void setExit() {
        this.isPending = false;
    }

    public void printList() {
        int i = 1;
        System.out.println("\tHere are the tasks in your list:");
        for (Task item : todoList) {
            if (item != null) {
                System.out.println("\t" + i + "." + item.toString());
//                System.out.println("\t" + i + ".[" + item.getStatusIcon() + "] " + item.description);
                i++;
            }
        }
    }

    public void addTodo(String todo) throws DukeException {
        this.task = new Todo(todo);
        todoList.add(this.task);
    }

    public void addDeadline(String deadline, String date) throws DukeException {
        this.task = new Deadline(deadline, date);
        todoList.add(this.task);
    }

    public void addEvent(String event, String date, String time) throws DukeException {
        this.task = new Event(event, date, time);
        todoList.add(this.task);
    }

    public Task getTask() {
        return this.task;
    }

    public void scan() throws DukeException {
        this.input = this.scan.nextLine();
        this.parse(input);
    }
}
