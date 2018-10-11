import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BorrachaListener implements ItemListener {

    private static String oldColor = "";

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            oldColor = Tela.COR;
            Tela.COR = "";
        }else
            Tela.COR = oldColor;

    }
}
