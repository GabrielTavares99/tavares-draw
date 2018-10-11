import javax.swing.*;
import java.awt.*;

public class PanelOptions {

    private JPanel pn;

    public JPanel getPn() {
        return pn;
    }

    public PanelOptions(){

        pn = new JPanel();
        pn.setOpaque(true);
        pn.setLayout(new GridLayout(2,1));
        pn.setBackground(Color.RED);
    }

}
