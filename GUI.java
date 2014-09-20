import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class GUI extends JFrame {

	private DayPanel dayPanel;

	private JTabbedPane tabbedPane;

	private ToDoPanel toDoPanel;

	public GUI() {

		super("Calendar & To-Do List");

		dayPanel = new DayPanel();

		toDoPanel = new ToDoPanel();

		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Day", dayPanel);
		tabbedPane.addTab("Week", null);
		tabbedPane.addTab("To-Do", toDoPanel);

		add(tabbedPane);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}