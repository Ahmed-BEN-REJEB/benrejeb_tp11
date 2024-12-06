package exemple;

import bandeau.Bandeau;

//Définition de la classe abstraite "Effet"
public abstract class Effet {
    
    //Définition du constructeur de la classe abtraite "Effet"
    Effet(){
    }

    //Définition des signatures des méthodes de la classe "Effet"
    public abstract void jouerEffet(Bandeau monBandeau);

}