package main.java;

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

    public void parse(String input) {
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
                this.addTodo(this.body);
                this.isTask = true;
                break;
            case "deadline":
                this.body = String.join(" ", Arrays.copyOfRange(text, 1, text.length-2));
                this.addDeadline(this.body, text[text.length-1]);
                this.isTask = true;
                break;
            case "event":
                this.body = String.join(" ", Arrays.copyOfRange(text, 1, text.length-2));
                this.addEvent(this.body, text[text.length-2], text[text.length-1]);
                this.isTask = true;
                break;
            default:
                System.out.println("Try again?");
                break;
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

    public void addTodo(String todo) {
        this.task = new Todo(todo);
        todoList.add(this.task);
    }

    public void addDeadline(String deadline, String date) {
        this.task = new Deadline(deadline, date);
        todoList.add(this.task);
    }

    public void addEvent(String event, String date, String time) {
        this.task = new Event(event, date, time);
        todoList.add(this.task);
    }

    public Task getTask() {
        return this.task;
    }

    public void scan() {
        this.input = this.scan.nextLine();
        this.parse(input);
    }
}
