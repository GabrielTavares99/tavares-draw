import javax.swing.*;
import java.awt.*;

public class PanelDraw {

    private JPanel pn;

    public JPanel getPn() {
        return pn;
    }

    public PanelDraw(){

        pn = new JPanel();
        pn.setOpaque(true);
        pn.setBackground(Color.pink);
        pn.setLayout(new GridLayout(30, 30));
        pn.setBackground(Color.YELLOW);
        for (int i = 0; i < 900; i++) {
            pn.add(new Pixel());
        }
    }

}
