package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class ModifPolice extends Effet{

    //Définition du constructeur de la classe "ModifPolice"
    public ModifPolice(){
        //Constructeur par défaut de cette classe
        super();
    }

    //Définition de la méthode "jouerEffet()" spécifique à cette classe
    public void jouerEffet(Bandeau monBandeau) {
        String fontFamily = "Monospaced";
        int fontWeight = Font.BOLD;
        int fontSize = 15;
    
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setFont(new Font(fontFamily, fontWeight, fontSize));
        monBandeau.setMessage("Police changée !");
        monBandeau.sleep(1000);
    }
    

}