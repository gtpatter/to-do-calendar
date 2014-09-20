import java.util.PriorityQueue;

public class ToDoList {

	private PriorityQueue<Task> taskList;

	public ToDoList() {

		taskList = new PriorityQueue<Task>();

	}

	public void addTask(Task newTask) {

		taskList.add(newTask);

	}

	public void completeTask(Task completedTask) {}

	public PriorityQueue getTaskList() {

		return taskList;

	}

	public void removeTask(Task oldTask) {

		taskList.remove(oldTask);

	}

	public void setTaskList(PriorityQueue newTaskList) {

		this.taskList = newTaskList;

	}

}