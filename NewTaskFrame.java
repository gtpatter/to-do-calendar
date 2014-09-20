import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewTaskFrame extends JFrame implements ActionListener {

	ActionListener actionListener;

	Integer[] priorityList;

	JButton cancelButton;
	JButton createButton;
	JComboBox priorityBox;
	JLabel nameLabel;
	JLabel priorityLabel;
	JPanel buttonPanel;
	JTextField nameField;

	public NewTaskFrame() {

			super("New Task");

			priorityList = new Integer[5];
			priorityList[0] = new Integer(1);
			priorityList[1] = new Integer(2);
			priorityList[2] = new Integer(3);
			priorityList[3] = new Integer(4);
			priorityList[4] = new Integer(5);

			cancelButton = new JButton("Cancel");
			cancelButton.addActionListener(this);
			createButton = new JButton("Create");
			createButton.addActionListener(this);
			priorityBox = new JComboBox(priorityList);
			nameLabel = new JLabel("Enter the name of the task:");
			priorityLabel = new JLabel("Choose the priority level of the task:");
			buttonPanel = new JPanel(new GridLayout(1, 2));
			buttonPanel.add(createButton);
			buttonPanel.add(cancelButton);
			nameField = new JTextField();

			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new GridLayout(5, 1));
			add(nameLabel);
			add(nameField);
			add(priorityLabel);
			add(priorityBox);
			add(buttonPanel);
			pack();
			setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cancelButton) {

			dispose();

		} else if (e.getSource() == createButton) {

			actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_FIRST, "Create Task"));
			dispose();

		}

	}

	public void addActionListener(ActionListener l) {

		actionListener = l;

	}

	public String getTaskName() {

		return nameField.getText();

	}

	public int getTaskPriority() {

		return (int)priorityBox.getSelectedItem();

	}

}