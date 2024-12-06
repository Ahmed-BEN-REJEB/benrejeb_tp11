package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet{
    
    //Définition du constructeur de la classe "Rotation"
    Rotation(){
        super();
    }

    //Définition de la méthode "jouerEffet()" relative à cette classe
    public void jouerEffet(Bandeau monBandeau){
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne de 360°...");
        for(int i=45; i<=360; i+=45){
            monBandeau.setRotation(Math.PI / 2.0f);
            monBandeau.sleep(100);
        }
        monBandeau.setRotation(0.0f);
    }
}
