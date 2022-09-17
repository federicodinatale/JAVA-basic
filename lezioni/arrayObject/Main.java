package lezioni.arrayObject;

public class Main {
    public static void main(String[] args) {

        // array normale
        int provaArrayVuoto[] = new int[3]; 
        provaArrayVuoto[0] = 1;
        provaArrayVuoto[1] = 10;
        provaArrayVuoto[2] = 100;

        System.out.println(provaArrayVuoto[1]);

        int[] provaArrayPiena = {10, 100, 1000};


        Persona personaProva = new Persona("Fede", 19, "Blu");
        //System.out.println(personaProva);

        //array di oggetti

        

        Persona persona1 = new Persona("Fede", 19, "Blu");
        Persona persona2 = new Persona("Maio", 90, "Rosso");
        Persona persona3 = new Persona("Franci", 20, "Giallo");

        Persona[] persona = {persona1, persona2, persona3};


        Persona giovanni = new Persona("Giovanni", 84, "Red");
        Persona luca = new Persona("Luca", 44, "Blue");

        giovanni.saluta(luca);



}
}