package lezioni;
public class array_java {
    public static void main(String[] args) {
        //ARRAY: collezione di dati correlati tra di loro

        int[] numeri = new int[3];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(numeri.length);  //3
        System.out.println(numeri[2]);      // elemento in posizione 2

        numeri[1] = 100;
        System.out.println(numeri[1]);      // elemento modificato in posizione 1


        int[] codici = {34,234,34,34,23,4};

        System.out.println(codici [codici.length -1]); //stampare l'ultimo elemento

        //iterare un array con un ciclo for
        for(int i = 0; i < codici.length; i ++) {
            System.out.println(codici[i]);
        }

        for(int codice : codici) {
            System.out.println(codice);
        }



        //Array di Array

        String[][] classi = new String[3][3];
        classi[0][0] = "Luca";
        classi[0][1] = "marco";
        classi[0][2] = "Lucia";

        classi[1][0] = "Luca1";
        classi[1][1] = "marco1";
        classi[1][2] = "Lucia1";

        classi[2][0] = "Luca2";
        classi[2][1] = "marco2";
        classi[2][2] = "Lucia2";

        System.out.println(classi[0][1]);
        
       for(int i = 0; i < classi.length; i ++) {

        System.out.println();
            for ( int j = 0; j < classi[i].length; j ++) {         
                System.out.print(classi[i][j] + " ");
            }
       } 
       
       

       // secondo modo per creare un array
       String[][] universita = {
           {"casa", "appartamento"},
           {"Torino", "Milano"},
           {"Italia", "Spagna"}
       };


       for(String[] classe :universita) {
        System.out.println();
           for (String students : classe) {
               System.out.print(students + " ");
           }
       }
       System.out.println();





       //return boolean
       String nome = "leonardo";
       System.out.println(nome.equals("leonardo"));

       System.out.println(nome.equalsIgnoreCase("LEONARDO"));

       System.out.println(nome.indexOf("o"));

       System.out.println(" ++++++++");

       System.out.println(nome.isEmpty());

       System.out.println(nome.toUpperCase());
       System.out.println(nome.toLowerCase());

       String nomeCane = " zoe ";
       System.out.println(nomeCane.trim());

       String cognome = "di natale";
       System.out.println(cognome.replace(" ", "_")); //di_natale

       Math.random();
       System.out.println(Math.random() * 10 );

    }
}
