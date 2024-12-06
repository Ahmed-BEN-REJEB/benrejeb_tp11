package exemple;

import java.util.ArrayList;
import bandeau.Bandeau;

public class Scenario {
    
    // Définition des attributs de la classe "Scenario"
    private ArrayList<EffetRepetition> effetRepetitions; // Liste des effets avec leur nombre de répétitions
    private Bandeau monBandeau;

    // Définition du constructeur de cette classe
    public Scenario() {
        effetRepetitions = new ArrayList<>();
        monBandeau = new Bandeau();
    }

    // Classe interne pour associer un effet avec son nombre de répétitions
    private static class EffetRepetition {
        Effet effet;
        int repetitions;

        EffetRepetition(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }

    // Méthode pour ajouter un effet avec un nombre de répétitions
    public void ajoutEffet(Effet effet, int repetitions) {
        if (repetitions <= 0) {
            throw new IllegalArgumentException("Le nombre de répétitions doit être supérieur à zéro.");
        }
        effetRepetitions.add(new EffetRepetition(effet, repetitions));
    }

    // Définition de la méthode "jouerScenario()"
    public void jouerScenario() {
        // Début du scénario
        monBandeau.setMessage("Début du scénario");
        monBandeau.sleep(1000);

        // Jouer chaque effet avec le nombre de répétitions spécifié
        for (EffetRepetition effetRepete : effetRepetitions) {
            for (int i = 0; i < effetRepete.repetitions; i++) {
                effetRepete.effet.jouerEffet(monBandeau);
            }
        }

        // Clôture du scénario
        monBandeau.setMessage("Scénario terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}
