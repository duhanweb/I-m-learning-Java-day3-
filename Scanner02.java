package Day04ifstatement;

import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Tm adınız");
        String son = input.nextLine();

        char ilkHarf = son.charAt(0);
        System.out.print(ilkHarf);
    }
}
