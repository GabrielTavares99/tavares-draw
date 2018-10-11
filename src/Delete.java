import javax.swing.*;

public class Delete {
    private JCheckBox checkBox;
    private JCheckBoxMenuItem delete;

    public JCheckBox getCheckBox() {
        return checkBox;
    }

    public JCheckBoxMenuItem getDelete() {
        return delete;
    }

    public Delete() {
        checkBox = new JCheckBox();
        delete = new JCheckBoxMenuItem("DELETE");
        delete.addItemListener(new BorrachaListener());
        checkBox.add(delete);
        checkBox.setBounds(0, 30, 100, 25);
    }

}
