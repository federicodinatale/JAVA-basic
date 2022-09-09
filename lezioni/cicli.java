package lezioni;
public class cicli {
    public static void main(String[] args) {
        System.out.println("hola");

        int i = 0;

        while(i <= 5) {
            System.out.println("ciao " + i);
            i++;
        }

        do {
            System.out.println("ciao " + i);
            i++;
        } while (i <= 5);

        for (int j = 0; j < 5; j++) {
            System.out.print("Riga: " + j + " ");
            for(int z = 0; z < 5; z ++) {
                System.out.print(z);
            }
            System.out.println();
        }

        int[] numeri = {1,2,3,4,5,6};
        for (int j : numeri) {
            System.out.println(j);
        }

        // BREAK : rompi
        for(int j : numeri) {
            if(j == 4) {
                System.out.println("Mostro fino al: " + j);
                break;
            }
            System.out.println(j);
        }
        // CONTINUE: salta quella linea
        for(int j : numeri) {
            if(j == 4) {
                System.out.println("numero saltato: " + j);
                continue;
            }
            System.out.println(j);
        }
    }
}


