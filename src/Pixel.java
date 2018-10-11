import javax.swing.*;
import java.awt.*;

public class Pixel extends JLabel {

    public Pixel(){
        setOpaque(true);
        setSize(5,5);
        setBackground(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.black, 1));
        addMouseListener(new PixelListener(this));
    }

}
