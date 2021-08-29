package main.java;

import java.util.Scanner;

public class Duke {
    private static Task todoList = new Task(10);
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
                for (String item : todoList.getTask()) {
                    if (item != null) {
                        System.out.println("\t" + i + ". " + item);
                        i++;
                    }
                }
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
