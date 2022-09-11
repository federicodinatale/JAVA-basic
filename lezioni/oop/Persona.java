package lezioni.oop;

public class Persona {
    String nome;
    String cognome;
    String favColor;
    int age;

    // viene chiamato automaticamente quando scriviamo new Persona()
    Persona(String nome, String cognome, String favColor, int age) {
        this.nome = nome;
        this.cognome = cognome;
        this.favColor = favColor;
        this.age = age;
    }


   void saluta() {
       System.out.println("ciao sono " + this.nome);
   }

   void addizione(int a, int b) {
        int risultato = a + b;
       System.out.println("il risultato è " + risultato);
       this.qwerty(risultato);
   }


   void qwerty(int prova) {
    System.out.println("da qwerty " + prova);
   }



   void canzone() {
       String song = "Coldplay";
       System.out.println(song);
       this.libro(song);
   }


   void libro(String song) {
    String book = "Ego is enemy"; 

    System.out.println("Canzone: " + song + "libro: " + book);
   }
}



