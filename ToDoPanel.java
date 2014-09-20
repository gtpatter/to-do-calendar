import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.PriorityQueue;

public class ToDoPanel extends JPanel implements ActionListener {

	private ArrayList<JCheckBox> taskBoxList;

	private GridLayout panelLayout;

	private JButton newTaskButton;

	private NewTaskFrame newTaskFrame;

	private ToDoList toDoList;

	public ToDoPanel() {

		toDoList = new ToDoList();

		panelLayout = new GridLayout(toDoList.getTaskList().size() + 1, 1);

		newTaskButton = new JButton("New Task");
		newTaskButton.addActionListener(this);

		setLayout(panelLayout);
		setAlignmentY(JComponent.LEFT_ALIGNMENT);

		add(newTaskButton);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == newTaskButton) {

			newTaskFrame = new NewTaskFrame();
			newTaskFrame.addActionListener(this);

		} else if (e.getSource() == newTaskFrame) {

			Task newTask = new Task(newTaskFrame.getTaskName(), false, null, newTaskFrame.getTaskPriority());
			toDoList.addTask(newTask);
			updatePanel();

		}

	}

	public void updatePanel() {

		removeAll();
		panelLayout = new GridLayout(toDoList.getTaskList().size() + 1, 1);
		setLayout(panelLayout);
		add(newTaskButton);
		PriorityQueue<Task> taskList = new PriorityQueue<Task>(toDoList.getTaskList());
		Task t = taskList.poll();
		while(t != null) {

			add(new TaskPanel(t));
			t = taskList.poll();

		}

	}

}