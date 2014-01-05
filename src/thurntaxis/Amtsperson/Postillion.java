package thurntaxis.Amtsperson;

import thurntaxis.spieler.Spieler;

/**
 * Klasse fuer den Postillion. Wenn der Postillion ausgespielt wird erhoeht sich der zaehlerKarteAblegen
 * des Spielers um 1.
 */
public class Postillion implements Amtsperson{

    @Override
    public void ausspielen(Spieler spieler) {
        spieler.setZaehlerKarteAblegen();
    }
}
