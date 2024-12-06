package exemple;

public class Main {
    public static void main(String[] args) {
        Scenario scenario = new Scenario();
    
        scenario.ajoutEffet(new ModifPolice(), 1);
        scenario.ajoutEffet(new Zoom(), 3);
        scenario.ajoutEffet(new Rotation(), 2);
    
        scenario.jouerScenario();
    }
    
}
