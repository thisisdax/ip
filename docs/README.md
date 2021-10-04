# User Guide
 
### Feature - Todo

A simple todo task that only includes description of the task.

### Feature - Deadline

A task with a deadline. E.g. (Project A 5th Aug)

### Feature - Event

A task with that includes time. E.g. (Movie 5th Aug 5pm)

## Usage
### `list` - display the status of the current list of task

Example of usage: 

`list`

Expected outcome:
```
list
    ____________________________________________________________
    Here are the tasks in your list:
    1.[T][X] read book
    2.[D][ ] return book (by: June 6th)
    3.[E][ ] project meeting (at: Aug 6th 2-4pm)
    4.[T][X] join sports club
    ____________________________________________________________
```
### `todo` - display the status of the current list of task

Example of usage: 

`todo Study`

Expected outcome:
```
todo Study
    ____________________________________________________________
    Got it. I've added this task: 
        [T][ ] Study
    Now you have 5 tasks in the list.
    ____________________________________________________________
```

### `deadline` - add a deadline task

Example of usage: 

`deadline Project A 5th Aug`

Expected outcome:
```
deadline Project A 5th Aug
    ____________________________________________________________
    Got it. I've added this task: 
        [D][ ] Project A (by: 5th Aug)
    Now you have 6 tasks in the list.
    ____________________________________________________________
```

### `event` - add an event task

Example of usage: 

`event Movie 5th Aug 5pm`

Expected outcome:
```
event Movie 5th Aug 5pm
    ____________________________________________________________
    Got it. I've added this task: 
        [E][ ] Movie (at: 5th Aug 5pm)
    Now you have 7 tasks in the list.
    ____________________________________________________________
```

### `done` - mark task as done by index

Example of usage: 

`done 5`

Expected outcome:
```
done 5
    ____________________________________________________________
    Noted. I've marked the following task as done:
        [T][X] Study
    ____________________________________________________________
```

### `delete` - delete an existing task by index

Example of usage: 

`delete 5`

Expected outcome:
```
delete 5
    ____________________________________________________________
    Noted. I've removed this task:
        [T][X] Study
    Now you have 6 tasks in the list.
    ____________________________________________________________
```

### `find` - find keyword in current list of task

Example of usage: 

`find movie`

Expected outcome:
```
find movie
    ____________________________________________________________
    Here are the matching tasks in your list:
    6.[E][ ] Movie (at: 5th Aug 5pm)
    ____________________________________________________________

```

### `bye` - exits the program and saves current list of tasks

Example of usage: 

`bye`

Expected outcome:
```
bye
    ____________________________________________________________
    Bye. Hope to see you again soon!
    ____________________________________________________________
```
