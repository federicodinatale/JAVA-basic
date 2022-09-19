public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("classe 30");

        Persona persona1 = new Persona("Federico", "Di Natale"); 
        System.out.println(persona1);
        Persona.personaTotale();

        Studente studente1 = new Studente("name", "dina");
        studente1.saluta();
        studente1.studio();

        Insegnante insegnante1 = new Insegnante("Fabrizio", "surname");
        insegnante1.insegno();

        Persona.personaTotale();

        studente1.saluta();
        insegnante1.saluta();
    }
}
