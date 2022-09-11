package lezioni.oop;


public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Federico", "Di Natale", "Blue", 39);
        System.out.println(persona1.nome);

        persona1.saluta();
        persona1.qwerty(5);
        persona1.canzone();
    }
}


