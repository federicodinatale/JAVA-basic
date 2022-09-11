package lezioni;

import java.util.Scanner;

public class metodi {
    static void cucinaPasta() {
        System.out.println("sto cucinando la pasta");
    }


    static void cucinaPranzo(String cibo) {
        System.out.println("sto cucinando " + cibo);

    }

    static void calcolatrice() {

        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primo numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println();

        System.out.println("Operazione: ");
        String operazione = scanner.nextLine();
        System.out.println();

        System.out.println("Secondo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println();

        switch(operazione) {
            case "+": 
                result = numero1 + numero2;
            break;
            case "-": 
                result = numero1 - numero2;
            break;
            case "*": 
                result = numero1 * numero2;
            break;
            case "/": 
                result = numero1 / numero2;
            break;
        }

        System.out.println("Il risultato è " + result);
    }

static int addizione(int a, int b) {
    return a + b;
}


//OVERLOAD METHOD

static int sottrazione(int a, int b) {
    return a - b;
}

static double sottrazione(double a, double b) {
    return a - b;  
}

    public static void main(String[] args) {
        //calcolatrice();

        int risultato = addizione(4,5);
        System.out.println(risultato);
    }
}
