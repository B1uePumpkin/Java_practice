import java.util.Scanner;
public class ConditionlStatement {
    public static void main(String[] args) {
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int x = s.nextInt();
        System.out.println(x * 10);
        */
        // if (條件式)
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int x = s.nextInt();
        if (x > 5) {
            System.out.println("too much");
        }else{
            System.out.println("too little");
        }
        */
        //if (條件式) else if (條件式) else
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int x = s.nextInt();
        if (x > 5) {
            System.out.println("too much");
        }else if (x < 5) {
            System.out.println("too little");
        }else{
            System.out.println("just right");
        }
        */
        // switch (變數)
        int n1 = 10;
        int n2 = 20;
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入運算符號: ");
        String op = s.next();
        switch (op) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("不支援的運算符號");
        }
    }
}
