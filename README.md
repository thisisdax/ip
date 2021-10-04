# Duke project template

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
3. After that, locate the `src/main/java/Duke.java` file, right-click it, and choose `Run Duke.main()` (if the code editor is showing compile errors, try restarting the IDE). If the setup is correct, you should see something like the below as the output:
   ```
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   ```
   
## Project description
This is a task tracking program that stores a list of tasks. The current supported task includes the follow,
- Todo: A simple todo task that only includes description of the task.
- Deadline: A task with a deadline. E.g. (Project A 5th Aug)
- Event: A task with that includes time. E.g. (Movie 5th Aug 5pm)

## User guide
The following are the available commands to use the program.
1. list - display the status of the current list of task
2. todo - add a todo task (e.g. todo Study)
3. deadline - add a deadline task (e.g. deadline Project A 5th Aug)
4. event - add an event task (e.g. event Movie 5th Aug 5pm)
5. done - mark task as done by index (e.g. done 2)
6. delete - delete an existing task by index (e.g. delete 2)
7. find - find keyword in current list of task (e.g. find book)
8. bye - exits the program and saves current list of tasks