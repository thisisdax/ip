package seedu.duke;

public class Deadline extends Task {
    protected String date;

    public Deadline(String description, String date) throws DukeException {
        super(description);
        this.date = date;
    }

    @Override
    public String toString() {
        return "[D]" + "[" + super.getStatusIcon() + "] " + super.description + " (by: " + date + ")";
    }

    @Override
    public String getType() {
        return "D";
    }

    @Override
    public String toSave() {
        return getType() + " | " + (super.isDone ? "1" : "0") + " | " + super.description + " | " + date;
    }
}