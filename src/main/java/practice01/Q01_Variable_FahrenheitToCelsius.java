package practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {

    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit değeri giriniz.");

        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat("#0.00");
        String formattedC = numberFormat.format(c);
        System.out.println("formattedC = " + formattedC+1);//Concatenation
        double doubleC =  Double.valueOf(formattedC);
        System.out.println("doubleC = " + (doubleC+1));//Matematik İşlemi (+)
    }
}
