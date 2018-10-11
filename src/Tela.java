import javax.swing.*;
import java.awt.*;

public class Tela {

    private JFrame tela = new JFrame("PAINT");

    public static String COR = "VERDE";

    public Tela() {
        tela.setSize(615, 520);
        tela.setLocationRelativeTo(null);
        tela.setLayout(new BorderLayout());

        ComboColors comboColors = new ComboColors();
        Delete delete = new Delete();

        PanelOptions panelOptions = new PanelOptions();
        panelOptions.getPn().add(comboColors.getColors());
        panelOptions.getPn().add(delete.getCheckBox());
        tela.add(panelOptions.getPn(), BorderLayout.LINE_START);

        PanelDraw panelDraw = new PanelDraw();
        tela.add(panelDraw.getPn(), BorderLayout.CENTER);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
