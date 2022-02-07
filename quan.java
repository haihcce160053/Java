import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //tao 2 phan so
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        Scanner sc = new Scanner(System.in);
        //nhap phan so thu nhat
        System.out.println("Enter fraction 1: ");
        System.out.print("Enter numerator of fraction 1: ");
        fraction1.setNumerator(sc.nextInt());
        System.out.print("Enter denominator of fraction 1: ");
        fraction1.setDenominator(sc.nextInt());
        sc.nextLine();
        // kiem tra mau so cua 
        if (fraction1.getDenominator() == 0) {
            System.out.println("The denominator cannot be 0. Set the value by 1!");
            fraction1.setDenominator(1);
        }
        //nhap phan so thu hai
        System.out.println("Enter fraction 2: ");
        System.out.print("Enter numerator of fraction 2: ");
        fraction2.setNumerator(sc.nextInt());
        System.out.print("Enter denominator of fraction 2: ");
        fraction2.setDenominator(sc.nextInt());
        sc.nextLine();
        // kiem tra mau so cua phan so thu hai
        if (fraction2.getDenominator() == 0) {
            System.out.println("The denominator cannot be 0. Set the value by 1!");
            fraction2.setDenominator(1);
        }
        // nhap interger
        int n;
        System.out.print("Enter interger: ");
        n = sc.nextInt();

        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " + " + n + " = " + fraction1.add(n));

        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2));
        System.out.println(fraction1 + " - " + n + " = " + fraction1.subtract(n));

        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2));
        System.out.println(fraction1 + " * " + n + " = " + fraction1.multiply(n));

        System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.divide(fraction2));
        System.out.println(fraction1 + " / " + n + " = " + fraction1.divide(n));
    }
}


//---------------------------------------------------------------------------

public class Fraction {

    private int numerator;
    private int denominator;

    //constructors 1
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    //constructors 2
    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    //constructors 3
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    
    //Getter and Setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
    
    
    //cong public Fraction add1 phan so
    public Fraction add(Fraction fraction) {
        int Snumerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
        int Sdenominator = this.getDenominator() * fraction.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    //cong 1 so
    public Fraction add(int fraction) {
        int Snumerator = this.getNumerator() + fraction * this.getDenominator();
        int Sdenominator = this.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    //tru 1 phan so
    public Fraction subtract(Fraction fraction) {
        int Snumerator = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
        int Sdenominator = this.getDenominator() * fraction.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    // tru 1 so 
    public Fraction subtract(int fraction) {
        int Snumerator = this.getNumerator() - fraction * this.getDenominator();
        int Sdenominator = this.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    // nhan 1 phan so
    public Fraction multiply(Fraction fraction) {
        int Snumerator = this.getNumerator() * fraction.getNumerator();
        int Sdenominator = this.getDenominator() * fraction.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }

    // nhan 1 so
    public Fraction multiply(int fraction) {
        int Snumerator = this.getNumerator() * fraction;
        int Sdenominator = this.getDenominator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    // chia 1 phan so
    public Fraction divide(Fraction fraction) {
        int Snumerator = this.getNumerator() * fraction.getDenominator();
        int Sdenominator = this.getDenominator() * fraction.getNumerator();
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
    
    //chia 1 so
    public Fraction divide(int fraction) {
        int Snumerator = this.getNumerator();
        int Sdenominator = this.getDenominator() * fraction;
        Fraction result = new Fraction(Snumerator, Sdenominator);
        return result;
    }
}
