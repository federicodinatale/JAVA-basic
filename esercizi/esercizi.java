package esercizi;
import java.util.Scanner;

public class esercizi {
   
static void TuttiPositiviPari() {

/**
* Esercizio 2.1: Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento
dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
altrimenti stampa "NO". Risolvere questo esercizio senza usare array
*/
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quanti numeri vuoi inserire?");
    int totalNumber = scanner.nextInt();

    boolean par = true;
    for (int i = 0; i < totalNumber; i ++) {

        System.out.println("Inserisci numero: ");
        int number = scanner.nextInt();

    if(number %2 != 0 || number < 0) par = false;
    }

    if (par) System.out.println("Tutti positivi e pari");
        else System.out.println("NO");

}
   
static void ContinuaFino() {
    /**
         * Esercizio 2.2: Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di
        interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
        almeno una delle seguenti condizioni:
            • `e negativo e divisibile per 2
            • `e positivo e divisibile per 3
        Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
        Risolvere questo esercizio senza usare array.
         */
        Scanner scanner = new Scanner(System.in);

         System.out.println("Inserisci un numero");
         int numero = scanner.nextInt();
        int sum = 0;
        while((numero < 0 && numero %2 == 0) || (numero >= 0 && numero %3 == 0)) {
            sum += numero; 
            System.out.println("Inserisci un numero");
            numero = scanner.nextInt();
        }
        System.out.println(sum);
}

static void PositivoNegativo() {
    
        /** 
         * Esercizio 2.3: Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
        di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
        valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
        del messaggio "OK" pu`o interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
        usare array.
         */
        Scanner scanner = new Scanner(System.in);

         System.out.println("Inserisci un numero");
         int numero = scanner.nextInt();
         boolean result = false;

        while(numero != 0) {

            int prev = numero;
            numero = scanner.nextInt();
            if ( prev > 0 && numero < 0) result = true;
         }

         if(result) System.out.println("OK");
         else System.out.println("NO");
}

static void MediaMultipliDiTre() {
   /**
* Esercizio 2.4: Scrivere un programma MediaMultipliDiTre che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri
inseriti che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il
risultato stampato dovr`a essere 9. Risolvere questo esercizio senza usare array
    */

    Scanner scanner = new Scanner(System.in);
    System.out.println("Quanti numeri vuoi?");
    int totalNumero = scanner.nextInt(); 
    int media = 0;
    int numeroDivisibili = 0;

    for (int i = 0; i < totalNumero; i ++) {
        System.out.println("inserisci un altro numero");
        double numero = scanner.nextInt();
        System.out.println();

        if (numero % 3 == 0) {
            media += numero;
            numeroDivisibili ++;

        };

    }
    
    if(media == 0) System.out.println("Non ci sono numero divisibili per 3");
    else System.out.println("la media è " + media / numeroDivisibili);
}

static void Ripetizioni() {
//     Esercizio 2.5: Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di
// caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.
// L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
// dovr`a essere ripetuto 5 volte. Risolvere questo esercizio senza usare array

    Scanner scanner = new Scanner(System.in);
    System.out.println("Quanti caratteri vuoi inserire");
    int numeroTotale = scanner.nextInt();
    System.out.println(numeroTotale);
}

public static void main(String[] args) {
        //TuttiPositiviPari();
        //ContinuaFino();
        //PositivoNegativo();
        //MediaMultipliDiTre();
        Ripetizioni();

    }
}
