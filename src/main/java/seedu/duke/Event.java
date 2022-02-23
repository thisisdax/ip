package seedu.duke;

public class Event extends Task {
    protected String date;
    protected String time;

    public Event(String description, String date, String time) throws DukeException {
        super(description);
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "[E]" + "[" + super.getStatusIcon() + "] " + super.description + " (at: " + date + " " + time + ")";
    }

    @Override
    public String getType() {
        return "E";
    }

    @Override
    public String toSave() {
        return getType() + " | " + (super.isDone ? "1" : "0") + " | " + super.description + " | " + date + " " + time;
    }
}
