package lab01;
import java.util.Scanner;

/*
yêu cầu: 
1. Nhập số a là số nguyên
2. Nhập phép toán là ký tự
3. Nhập số b là số nguyên
=> in ra kết quả phép toán
 */
public class homework {

    public static void main(String[] args) {
        double a, b;
        char op;

        Scanner sc = new Scanner(System.in);    
        
        //Input a
        while (true) {
            try {
                System.out.print("Input a: ");
                a = sc.nextDouble();
                sc.nextLine();
                if (a == (Double) a) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        }
        
        //Input operator
        while (true) {
            try {
                
                System.out.print("Input operator: ");
                op = sc.next().charAt(0);
                sc.nextLine();
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == ':') {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        }
        
        //Input b
        while (true) {
            try {
                System.out.print("Input b: ");
                b = sc.nextDouble();
                sc.nextLine();
                if (b == (Double) b) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        }

        //Print
        if (op == '+') {
            System.out.println(a + b);
        }
        if (op == '-') {
            System.out.println(a - b);
        }
        if (op == '*') {
            System.out.println(a * b);
        }
        if (op == ':' || op == '/') {
            System.out.println(a / b);
        }
    }
}
