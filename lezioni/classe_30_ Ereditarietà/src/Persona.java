public class Persona {
    String name; 
    String surname;
    static int totale; 

    Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
        totale ++;
    }

    public String toString() {
        String stringa = this.name + " " + this.surname;
        return stringa; 
    }

    static void personaTotale() {
        System.out.println(totale);
    }

    public void saluta() {
        System.out.println("Ciao");
    }
}