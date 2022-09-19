public class Insegnante extends Persona{

    String materia = "Matematica"; 
    String[] classi = {"1D", "2D", "3D"};

    Insegnante(String name, String surname) {
        super(name, surname);
    }

    public void insegno() {
        System.out.println("Sto insegnando...");
    }

    @Override
    public void saluta() {
        System.out.println("Buongiorno Ragazi");
    }
}