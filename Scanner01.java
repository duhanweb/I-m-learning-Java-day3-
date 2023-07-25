package Day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ad Soyad");
        String isim = input.nextLine();

        System.out.println("TC KİMLİK NO NUZU GİRİNİZ");

        String tc = input.nextLine();

        System.out.println(isim);
        System.out.println(tc);

    }
}