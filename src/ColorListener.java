import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorListener implements ItemListener {

    private JCheckBox checkBox;

    public ColorListener(JCheckBox checkBox) {

        this.checkBox = checkBox;
    }

    public ColorListener() {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object item = e.getItem();
        Tela.COR = (String) item;
    }
}
