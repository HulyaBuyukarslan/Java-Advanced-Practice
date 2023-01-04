package practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {
/*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

    public static void main(String[] args) {

        System.out.println(enUzunKelime());
    }

    public static List<String> enUzunKelime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = input.nextLine();
        String[] arr = cumle.split(" ");

        int max = 0;

        for (String w : arr) {
            if (w.length() > max) {
                max = w.length();
            }
        }

        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w:arr){
            if(w.length()==max){
                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;
    }


}

//Önce maximum değeri bulunuyor fakat bu değer bulunurken her seferinde her
//kelime için max değeri güncelleniyor
//o yüzden 2. for dongüsünün üzerinde tekrar kontrol edilip sonuç ekrana alınıyor.
//1den fazla max olabilcegi icin 2.for u kullandik.
