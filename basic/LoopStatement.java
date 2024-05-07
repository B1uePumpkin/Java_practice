import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        // continue statement
        /*
        for (int x = 1; x <= 10; x++) {
            if (x%2 == 0) {
                continue;
            }
            System.out.println("x = " + x);
        }
        */
        // break statement
        /*
        int x = 0;
        while (x < 10) {
            if (x == 5) {
                break;
            }
            System.out.println("x = " + x);
            x ++;
        }
        */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("請輸入一個正整數: ");
            num = scanner.nextInt();
            if (num > 0) {
                break;
            }else{
                System.out.println("你輸入的不是正整數，請重新輸入。");
            }
        }
        System.out.println("你輸入的正整數是: " + num);
        
    }
    
}
