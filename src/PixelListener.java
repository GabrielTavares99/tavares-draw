import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PixelListener implements MouseListener {

    private JLabel pixel;

    public PixelListener(JLabel pixel) {
        this.pixel = pixel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        paint_pixel(e);
    }

    private void paint_pixel(MouseEvent e) {
        if (e.getButton() == 1) {
            if (Tela.COR.equalsIgnoreCase("azul"))
                pixel.setBackground(Color.BLUE);

            else if (Tela.COR.equalsIgnoreCase("verde"))
                pixel.setBackground(Color.GREEN);
            else if (Tela.COR.equalsIgnoreCase("vermelho"))
                pixel.setBackground(Color.RED);
            else
                pixel.setBackground(Color.GRAY);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        paint_pixel(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
