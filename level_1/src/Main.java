import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        scanner.close();
        System.out.println(calc(task));
    }

    public static String calc (String input) throws IOException{

        int a, b;
        String ansver = null;
        String  plus = "+", minus = "-", divide = "/", multiply = "*";

        String [] cleanTask = input.split(" ");
        a = Integer.parseInt(cleanTask[0]);
        b = Integer.parseInt(cleanTask[2]);

        if (a > 0 && a < 11 && b > 0 && b < 11 && cleanTask.length == 3) {

            switch (cleanTask[1]) {
                case "+":
                    ansver = String.valueOf(a + b);
                    break;
                case "-":
                    ansver = String.valueOf(a - b);
                    break;
                case "/":
                    ansver = String.valueOf(a / b);
                    break;
                case "*":
                    ansver = String.valueOf(a * b);
                    break;
            }
        } else {
            throw new IOException();
        }
            /*
                if (cleanTask[1].equals(plus)){
                    int c = a + b;
                    ansver = String.valueOf(c);
                }else if (cleanTask[1].equals(minus)){
                    int c = a - b;
                    ansver = String.valueOf(c);
                }else if (cleanTask[1].equals(divide)){
                    int c = a / b;
                    ansver = String.valueOf(c);
                }else if (cleanTask[1].equals(multiply)){
                    int c = a * b;
                    ansver = String.valueOf(c);
                }*/

        return ansver;
    }
}
