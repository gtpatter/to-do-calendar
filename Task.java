import java.util.Date;

public class Task implements Comparable {

	private boolean completed;
	private Date dueDate;
	private int priority;
	private String name;

	public Task() {

		name = null;
		completed = false;
		dueDate = null;
		priority = 1;

	}

	public Task(String name, boolean completed, Date dueDate, int priority) {

		this.name = name;
		this.completed = completed;
		this.dueDate = dueDate;
		this.priority = priority;

	}

	public int compareTo(Object o) {

		return priority - ((Task)o).getPriority();

	}

	public boolean getCompleted() {

		return completed;

	}

	public Date getDueDate() {

		return dueDate;

	}

	public String getName() {

		return name;

	}

	public int getPriority() {

		return priority;

	}

	public void setCompleted(boolean newCompleted) {

		this.completed = newCompleted;

	}

	public void setDueDate(Date newDueDate) {

		this.dueDate = newDueDate;

	}

	public void setName(String newName) {

		this.name = newName;

	}

	public void setPriority(int newPriority) {

		this.priority = newPriority;

	}

}