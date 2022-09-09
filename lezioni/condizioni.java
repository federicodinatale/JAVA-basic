package lezioni;
public class condizioni {
    public static void main(String[] agrs) {
        System.out.println("OPERATORI di COMPARAZIONE E LOGICI");

        int x = 5;
        int y = 10;
        boolean result = x > y;
        System.out.println(result);

        System.out.println(x == y);
        System.out.println(x != y);

        System.out.println(5 > 2 && y %3 == 0); //and
        System.out.println(5 > 2 || y % 3 == 0); //or

        System.out.println((!true)); // inverte 

        System.out.println("IF ELSE");
        String user = "offline  sdsd";
        if (user == "online") {
            System.out.println("online");
        } else if( user == "offline") {
            System.out.println("offline");
        } else {
            System.out.println("non si sa");
        }

        System.out.println("OPERATORE TERNARIO");

        String ternario = 5 < 10 ? "è minore" : "è maggiore";
        System.out.println(ternario);
    }
}
