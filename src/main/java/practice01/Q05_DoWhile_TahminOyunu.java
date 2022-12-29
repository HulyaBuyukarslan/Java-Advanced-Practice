package practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int rastgeleSayi = (int)(Math.random()*100)+1;

        do {
            System.out.println("0-100 arası bir sayı tahmini giriniz");
            sayi = input.nextInt();
            if(sayi==rastgeleSayi){
                System.out.println("Tebrikler!!");
            } else if (sayi<rastgeleSayi) {
                System.out.println("Daha büyük bir sayı giriniz");
            }else {
                System.out.println("Daha küçük bir sayı giriniz");
            }
        }while (sayi!=rastgeleSayi);
    }
}

