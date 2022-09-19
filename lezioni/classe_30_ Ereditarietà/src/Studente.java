public class Studente extends Persona {

    String materiaPreferita = "Storia"; 
    String classe = "2D"; 
    int[] votiStoria = {9,9,9};
    
    Studente(String name, String surname) {
        super(name, surname);
    }

    public void studio() {
        System.out.println("Sto studiando...");
    }

    @Override
    public void saluta() {
        System.out.println("Buongiorno Prof!");
    }
}
