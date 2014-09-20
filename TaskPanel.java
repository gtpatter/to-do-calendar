import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TaskPanel extends JPanel {

	private GridLayout panelLayout;

	private Task task;

	public TaskPanel(Task t) {

		setAlignmentY(JComponent.LEFT_ALIGNMENT);

		panelLayout = new GridLayout(1, 1);

		task = t;

		add(new JCheckBox(task.getName()));
		//add(new JLabel(task.getDueDate().toString()));

	}

}