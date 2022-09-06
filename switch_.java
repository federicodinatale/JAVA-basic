import java.util.Scanner;


public class switch_ {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primo numero");
        int firstNumer =  scanner.nextInt();
        scanner.nextLine();

        System.out.println("Operazione");
        String operator = scanner.nextLine();

        System.out.println("Secondo numero");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();


        
        System.out.println("il numero è " + firstNumer +  "\nil secondo numero è " + secondNumber);
        
        double result;
        switch(operator) {
            case "+":
                result = firstNumer + secondNumber; 
                System.out.println(result);
            break;

            case "-":
                result = firstNumer - secondNumber; 
                System.out.println(result);

            break;

            case "*":
                result = firstNumer * secondNumber;
                System.out.println(result);

            break;

            case "/":
                result = firstNumer / secondNumber; 
                System.out.println(result);

            break;
        }
    }
}
