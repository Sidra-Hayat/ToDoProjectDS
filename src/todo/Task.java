package todo;

public class Task {
    private String title;
    private String description;
    private boolean completed;
    private String priority; // "High", "Medium", "Low"

    public Task(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }
    // For editing 'completed' flag
    public Task(String title, String description, String priority, boolean completed) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + title + " (" + priority + ")";
    }
}