import javax.swing.*;

public class ComboColors {
    private JComboBox<String> colors;

    public JComboBox<String> getColors() {
        return colors;
    }

    public void setColors(JComboBox<String> colors) {
        this.colors = colors;
    }

    public ComboColors() {
        colors = new JComboBox<>();
        colors.addItem("VERDE");
        colors.addItem("VERMELHO");
        colors.addItem("AZUL");
        colors.setBounds(0, 0, 118, 25);
        colors.addItemListener(new ColorListener());
    }

}
