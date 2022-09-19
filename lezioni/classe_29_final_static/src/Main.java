public class Main {
    public static void main(String[] args) throws Exception {
        // final è una variabile che non può cambiare 
        final int numeroCheNonCambia = 5;

        //static
        Persona persona1 = new Persona("Federico", "Di Natale");
        System.out.println(persona1);

        Persona persona2 = new Persona("maio", "surname");

        System.out.println(Persona.numeroPersone);

        Persona.numeroPersone();
    }
}
