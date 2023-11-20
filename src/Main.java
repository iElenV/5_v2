import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(2, 4);
        System.out.print( "Комплексное число 1: ");
        complex1.getComplex();
        System.out.print( "Комплексное число 2: ");
        complex2.getComplex();
        double a1 = complex1.a;
        double a2 = complex2.a;
        double b1 = complex1.b;
        double b2 = complex2.b;
        sum (a1, a2, b1, b2);
        dif (a1, a2, b1, b2);
        mult (a1, a2, b1, b2);
        equal (a1, a2, b1, b2);


            }


     public static void sum (double a1, double a2, double b1, double b2) {
        double sum_a = a1 + a2;
        double sum_b = b1 + b2;
        Complex complex3 = new Complex(sum_a, sum_b);
        System.out.print( "Сумма комплексных чисел: ");
        complex3.getComplex();
        }

    public static void dif (double a1, double a2, double b1, double b2) {
        double dif_a = a1 -a2;
        double dif_b = b1 - b2;
        Complex complex3 = new Complex(dif_a, dif_b);
        System.out.print( "Разность  комплексных чисел: ");
        complex3.getComplex();
    }

    public static void mult (double a1, double a2, double b1, double b2) {
        double mult_a = a1*a2 - b1*b2;
        double mult_b = a1*b2 + b1*a2;
        Complex complex3 = new Complex(mult_a, mult_b);
        System.out.print( "Произведение комплексных чисел: ");
        complex3.getComplex();
    }

    public static void equal (double a1, double a2, double b1, double b2) {
        if (a1==a2 && b1== b2) {
            System.out.println( "Комплексные числа равны");}
        else {
            System.out.println( "Комплексные числа не равны");
        }


    }




}


