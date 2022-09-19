public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Copiare degli Oggetti ");

        Persona persona1 = new Persona("Federico", "Di Natale");
        Persona persona2 = new Persona("Fabrizio", "Rossi");

        //persona2 = persona1; 
        persona1.setName("Orazio");
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println();
        System.out.println(persona1.getName());
        System.out.println(persona1.getSurname());
        System.out.println();
        System.out.println(persona2.getName());
        System.out.println(persona2.getSurname());

      
    }
}
