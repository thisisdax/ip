package main.duke;

import java.util.*;

public class Duke {
//    public static ArrayList<Task> todoList = new ArrayList<>();
    private static ArrayList<Task> todoList = TaskList.getInstance().getList();
    private static void run() {
//        Scanner input = new Scanner(System.in);
//        String cmd = input.nextLine();
        Parser parser = new Parser();
//        parser.scan();
//        String cmd = parser.getCmd();
        while (parser.isPending) {
            try {
                parser.scan();
                if (parser.isTask) {
                    System.out.println("\t____________________________________________________________");
                    System.out.println("\tGot it. I've added this task: ");
                    System.out.println("\t\t" + parser.getTask().toString());
                    System.out.println("\tNow you have " + todoList.size() + (todoList.size() > 1 ? " tasks" : " task") + " in the list.");
                    System.out.println("\t____________________________________________________________");
                }
            } catch (DukeException e) {
                e.printErrorMessage();
            }
//            if (cmd.toLowerCase().equalsIgnoreCase("bye")) {
//                break;
//            }
//            if (cmd.toLowerCase().equalsIgnoreCase("list")) {
//
//            } else if (cmd.length() > 4 && cmd.substring(0, 4).toLowerCase().equalsIgnoreCase("done")) {
//                int itemNumber = Integer.parseInt(cmd.substring(5)) - 1;
//                todoList.get(itemNumber).markAsDone();
//                System.out.println("\tNice! I've marked this task as done:");
//                System.out.println("\t["+ todoList.get(itemNumber).getStatusIcon() + "] " + todoList.get(itemNumber).description);
//            } else {
//                Task newTask = new Task(cmd);
//                todoList.add(newTask);
//                System.out.println("\tadded: "+cmd);
//            }
//            parser.scan();
//            cmd = parser.getCmd();
//            cmd = input.nextLine();
//            parser.parse(cmd);
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
