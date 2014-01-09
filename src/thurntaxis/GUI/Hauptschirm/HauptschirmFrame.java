package thurntaxis.gui.hauptschirm;

import javax.swing.*;
import java.awt.*;

import com.sun.codemodel.internal.JFieldRef;
import thurntaxis.spiel.*;

/**
 * Klasse um den hauptschirm vom Typ JFrame zu erstellen. der hauptschirm vereint 2 Panels in sich
 * (Spielbrett und Spielersteuerung)
 */
public class HauptschirmFrame extends JFrame {

    public HauptschirmFrame(Spielleiter spielleiter) {
        super("Thurn & Taxis: Das Brettspiel");

        SpielbrettPanel spielbrettPanel = new SpielbrettPanel(spielleiter);
        SpielersteuerungPanel spielersteuerung = new SpielersteuerungPanel(spielleiter, spielbrettPanel);

        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        this.add(spielersteuerung);
        this.add(spielbrettPanel);

        this.pack();
        this.setVisible(true);
    }

}
