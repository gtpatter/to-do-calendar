import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CategoryPanel extends JPanel {

	private ArrayList<String> categories;
	private ArrayList<JCheckBox> categoryBoxes;

	private GridLayout panelLayout;

	public CategoryPanel() {

		categories = new ArrayList<String>();
		categories.add("Classes");
		categories.add("Holidays");
		categories.add("Meetings");
		categories.add("Social Events");

		categoryBoxes = new ArrayList<JCheckBox>();

		panelLayout = new GridLayout(categories.size(), 1);

		setLayout(panelLayout);

		for (int i = 0; i < categories.size(); i++) {

			categoryBoxes.add(new JCheckBox(categories.get(i)));
			add(categoryBoxes.get(i));

		}

	}

}