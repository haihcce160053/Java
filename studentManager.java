package haihcce160053;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Huynh Chi Hai
 * @code CE160053
 */
public class Student {

    //Declare array
    public static ArrayList<String> name = new ArrayList<String>();

    //Show menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("STUDENT NAMES MANAGER");
            System.out.println("1. Add a name");
            System.out.println("2. Show names list");
            System.out.println("3. Search for name");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = sc.nextInt();
                sc.nextLine();              
                switch (choice) {
                    case 1:
                        addName();
                        break;
                    case 2:
                        nameList();
                        break;
                    case 3:
                        nameSearch();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } catch (Exception ex) {
                //Check number and check overload data
                System.out.println("Wrong format, please enter number in menu!");
            }
            System.out.print("-------------------------\n");
        }
    }

    //Add input name
    public static void addName() {
        try {
            if (name.size() <= 20) {
                System.out.print("Please enter name: ");
                Scanner sc = new Scanner(System.in);
                String inputName = sc.nextLine();
                
                boolean isNum = false;
                for (int i = 0; i < inputName.length(); i++) {
                    if ((int) inputName.charAt(i) >= 0 && (int) inputName.charAt(i) < 32 || (int) inputName.charAt(i) > 32 && (int) inputName.charAt(i) < 65 || (int) inputName.charAt(i) > 90 && (int) inputName.charAt(i) < 97 || (int) inputName.charAt(i) > 122 && (int) inputName.charAt(i) <= 127) {
                        isNum = true;
                    }
                }
                if (isNum == false) {
                    if (inputName.length() <= 50) {
                        name.add(inputName);
                        System.out.println("*** Name added! ***");
                    } else {
                        System.out.println("Your name is too long!");
                    }
                } else {
                    System.out.println("Accept only alphabet, please try again!");
                }

            } else {
                System.out.println("Can't add anymore because max 20 names!");
            }

        } catch (Exception ex) {
            System.out.println("Accept only alphabet, please try again!");
        }

    }

    //Show name list
    public static void nameList() {
        System.out.println("* Name list: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println("- " + name.get(i));
        }
    }

    //Search name
    public static void nameSearch() {

        try {
            System.out.print("Please enter keyword: ");
            Scanner sc = new Scanner(System.in);
            String keyword = sc.nextLine();
            boolean canShow = false;
            System.out.println("[1]: Search first");
            System.out.println("[2]: Search all");
            System.out.print("Your choice: ");
            int chocieSearch = sc.nextInt();
            switch (chocieSearch) {
                case 1:
                    for (int i = 0; i < name.size(); i++) {
                        String[] ne = name.get(i).split("\\s+");
                        if (ne[0].toLowerCase().contains(keyword.toLowerCase())) {
                            canShow = true;
                            System.out.println("- " + name.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < name.size(); i++) {
                        if (name.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                            canShow = true;
                            System.out.println("- " + name.get(i));
                        }
                    }
                    break;
                default:
                    break;
            }

            if (canShow == false) {
                System.out.println("No result for your keyword!");
            }
        } catch (Exception ex) {
            System.out.println("Wrong format, please enter number in menu!");
        }

    }
}
