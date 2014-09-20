import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class DayPanel extends JPanel {

	private CategoryPanel categoryPanel;

	private JSplitPane splitPane;

	public DayPanel() {

		super();

		categoryPanel = new CategoryPanel();

		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, categoryPanel, null);

		add(splitPane);

	}

}