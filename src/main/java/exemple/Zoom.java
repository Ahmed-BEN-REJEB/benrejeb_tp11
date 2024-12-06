package exemple;
import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet{

    //Définition du constructeur de la classe "Rotation"
    Zoom(){
        super();
    }

    //Définition de la méthode "jouerEffet()" relative à cette classe
    public void jouerEffet(Bandeau monBandeau){
        
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 10; i <= 60; i += 10) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, i));
            monBandeau.sleep(100);
        }
        for (int i = 60; i >= 10; i -= 10) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, i));
            monBandeau.sleep(100);
        }
    }
}
