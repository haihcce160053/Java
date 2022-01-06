package helloworld;

import java.util.Scanner;
import static java.lang.System.out;

public class Helloworld {

    public static void main(String[] args) {
        
        String str = "Hello, my name is Hai"; //Chuỗi gốc      
        
        int dem_str = str.length(); //Đếm số lượng ký tự trong chuỗi str
              
        char[] ch = str.toCharArray(); //Thêm chuỗi vào char[]
        
        int dem_ch = ch.length; //Đếm ký tự trong char[]
             
        String[] split_str = str.split("\\s+"); //Tách chuỗi giữa các khoảng trắng

        for (String string : split_str) {
            //Duyệt từng phần tử trong mảng String[] split_str
        }
      
        int a = Integer.parseInt(str); //Chuyển đổi chữ thành số
        String str_convert = Integer.toString(a); //Chuyển đổi số thành chữ
        System.exit(0); //Tắt chương trình
        
    }
}
