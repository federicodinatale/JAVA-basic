
// Per stampare a schermo

public class Main {
    public static void main(String[] args) {

        System.out.println("Variabili");

        // numero intero
        int x;                      //dichiarazione 
        x = 45;                     //assegnazione

        int y = 40;                 //inizzializazione
        double z = 6.50;            //numeri con la virgola
        String name = "Federico";   // strings

        System.out.println(x);
        x = 100;                    //le variabili possono cambiare valore
        System.out.println(x);
        

        //byte
        byte numero = -127;

        //posso scriverlo cosi oppure 2000000000. tuttavia con _ si legge meglio
        int numeroGrande = 2_000_000_000;

        //Per il long, bisogna mettere la L o l alla fine
        long numeroMoltoGrande = 324039409909948234L;

        // anche qui, devo mettere la lettere f alla fine. 
        // Mentre per il double non ho bisogno di mettere nessuna lettea
        float ilFloat = 45.50f;

        // "" identifica stringa. '' identifica char
        char ilChar = 'f';

        String string = "f";
        System.out.println(string.toUpperCase());
    }


    /**
     * 
     * 
     * 
     *
     */
    
}

