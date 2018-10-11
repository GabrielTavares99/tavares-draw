import javax.swing.*;
import java.awt.*;

public class Tela {

    private JFrame tela = new JFrame("PAINT");

    public static String COR = "VERDE";

    public Tela() {
        tela.setSize(615, 520);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);

        ComboColors comboColors = new ComboColors();
        tela.add(comboColors.getColors());

        Delete delete = new Delete();
        tela.add(delete.getCheckBox());

        GridLayout gridLayout = new GridLayout(30, 30);
        JPanel jPanel = new JPanel(gridLayout);
        jPanel.setOpaque(true);
        jPanel.setBackground(Color.YELLOW);
        jPanel.setBounds(114, 0, 500, 500);

        for (int i = 0; i < 900; i++) {
            jPanel.add(new Pixel());
        }

        tela.add(jPanel);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
