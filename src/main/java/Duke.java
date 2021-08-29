package main.java;

import java.util.Scanner;

public class Duke {
    private static Task todoList = new Task(100);
    private static void run() {
        Scanner input = new Scanner(System.in);
        String cmd = input.nextLine();
        while (true) {
            System.out.println("\t____________________________________________________________");
            if (cmd.toLowerCase().equalsIgnoreCase("bye")) {
                break;
            }
            if (cmd.toLowerCase().equalsIgnoreCase("list")) {
                int i = 1;
                boolean[] status = todoList.getStatus();
                System.out.println("\tHere are the tasks in your list:");
                for (String item : todoList.getTask()) {
                    if (item != null) {
                        System.out.println("\t" + i + ".[" + (status[i-1] ? "\u2717" : " ") + "] " + item);
                        i++;
                    }
                }
            } else if (cmd.length() > 4 && cmd.substring(0, 4).toLowerCase().equalsIgnoreCase("done")) {
                int itemNumber = Integer.parseInt(cmd.substring(5)) - 1;
                todoList.doTask(itemNumber);
                System.out.println("\tNice! I've marked this task as done:");
                System.out.println("\t["+ (todoList.getStatus()[itemNumber] ? "\u2717" : " ") +"] " + todoList.getTask()[itemNumber]);
            } else {
                todoList.setTask(cmd);
                System.out.println("\tadded: "+cmd);
            }
            System.out.println("\t____________________________________________________________");
            cmd = input.nextLine();
        }
    }
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        System.out.println("\t____________________________________________________________");
        System.out.println("\tHello! I'm Duke");
        System.out.println("\tWhat can I do for you?");
        System.out.println("\t____________________________________________________________");

        run();
        System.out.println("\tBye. Hope to see you again soon!");
        System.out.println("\t____________________________________________________________");
    }

}
