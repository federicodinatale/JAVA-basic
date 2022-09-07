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

    }
}
