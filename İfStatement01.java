package Day04ifstatement;

public class İfStatement01 {

    public static void main(String[] args) {

        int s = 12;


        if (s > 0) {

            System.out.println("Positive");
        }

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buuyk harf");
        }

        //&& islemi sadece boolean ile kullanılır

        int n = 123 ;

       n = Math.abs(n);

        if(n>99 && n<1000){
            System.out.println("Uc basamaklı");
        }


        int p = 17;

        if(p%2==0){
            System.out.println("cift sayı");
        }
    }
}
