package lezioni;
//Input dall'utente

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String name = scanner.nextLine();

        System.out.println("Il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("etá?");
        int eta = scanner.nextInt(); //non crea una nuova linea
        scanner.nextLine(); // quindi devo inserire nextLine()

        System.out.println("Città");
        String city = scanner.nextLine();

        System.out.println("Ti chiami " + name + " " + cognome + "e hai " + 
        eta + "anni. Vivi a " + city);
        }
}
