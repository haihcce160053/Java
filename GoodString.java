package goodstring;
import java.util.Scanner;
import static java.lang.System.out;

public class GoodString {
    //Chuyển đổi chữ in hoa về dạng thường
    public static void main(String[] args) {
        /*ASCII
        for (int i = 0; i < 128; i++) {
            out.println(i + " | " + (char) i);
        }
        */
        
        Scanner sc = new Scanner(System.in);
        out.print("Input your string: ");
        String s = sc.nextLine();
        String result= "";
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                int a = (int) ch[i] + 32;
                ch[i] = (char)a;
            }
            result = result + ch[i];
        }
        
        out.println("Good string: " + result);
    }

}
