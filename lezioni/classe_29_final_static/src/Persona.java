public class Persona {
    String name;
    String surname;
    static int numeroPersone;

    Persona(String name, String surname) {
        this.name = name;
        this.surname = surname; 
        numeroPersone ++;
        System.out.println(numeroPersone);
    }

    public String toString() {
        String stringa = this.name + " " + this.surname;
        return stringa;
    }

    static void numeroPersone() {
        System.out.println(numeroPersone);
    }
}
