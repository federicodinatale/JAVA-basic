package lezioni;
public class aritmetica {
    public static void main(String[] args) {
        System.out.println("Operazioni");

        int z = 5;
        int y = 10;

        System.out.println(z + y);
        System.out.println(y % z); //modulo: il resto


        int a = 10;
        a += 5; 
        System.out.println(a);

        a ++; //incremento di 1
        System.out.println(a);

        a --; //decremento di 1
        System.out.println(a);

        System.out.println(Math.min(5, 10));
        System.out.println(Math.abs(-55));
        System.out.println(Math.pow(55,2));
        System.out.println(Math.PI);
    }
}
