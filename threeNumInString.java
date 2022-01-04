import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    //Đếm xem có bao nhiêu cụm chứa 3 số trong một chuỗi bự
    //Ex: a123, abcd123 -> 2 
    public static void main(String[] args) {
        String a = "a123 abcd123 efd";
        String[] str = a.split("\\s+");
        String get_str;
        int size = str.length;
        int count_in_one = 0, count = 0;
        for (int j = 0; j < size; j++){
            get_str = str[j];
            count_in_one = 0;
            for(int i = 0; i < get_str.length(); i++){
                if(Character.isDigit(get_str.charAt(i)) == true){
                    count_in_one = count_in_one + 1;
                }
            }
            if(count_in_one == 3){
                count = count + 1;
            }
        }
        out.println("Tong: " + count);
    }
}
