package arraylistilekahvemakinesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class C01_kahveSeciniz {
    static ArrayList<String> kahvelistesi = new ArrayList<>(Arrays.asList("1. Espresso","2. Cappucino","3. Decaf","4. Macchiato","5. Mocha"));

    static int toplamTutar=0;

    public static void kahveseciniz() {
        Scanner scan = new Scanner(System.in);



        for (String each : kahvelistesi) {
            System.out.println(each);
        }
        int kahveAdiSayisi = scan.nextInt();

        System.out.println("lutfen sectiginiz kahve icin ayrica boyut seciniz");
        switch (kahveAdiSayisi) {

            case 1:
                System.out.println("espresso boyutlari" + "\n1.kucuk" + "\n 2. orta" + "\n3. buyuk");
                toplamTutar=2;
                break;
            case 2:
                System.out.println("Cappucino boyutlari" + "\n1.kucuk" + "\n 2. orta" + "\n3. buyuk");
                toplamTutar=3;
                break;
            case 3:
                System.out.println("Decaf boyutlari" + "\n1.kucuk" + "\n 2. orta" + "\n3. buyuk");
                toplamTutar=4;
                break;
            case 4:
                System.out.println("Macchiato boyutlari" + "\n1.kucuk" + "\n 2. orta" + "\n3. buyuk");
                toplamTutar=2;
                break;
            case 5:
                System.out.println("Mocha boyutlari" + "\n1.kucuk" + "\n 2. orta" + "\n3. buyuk");
                toplamTutar=3;
                break;

        }
        int kahvebuyuklugu = scan.nextInt();
        if (kahvebuyuklugu==1) {
            toplamTutar+=0;
            System.out.println("odemeniz gereken tutar : " + toplamTutar + "£");
        } else if (kahvebuyuklugu==2) {
            toplamTutar+=1;
            System.out.println("odemeniz gereken tutar : " + toplamTutar + "£");
        } else if (kahvebuyuklugu==3) {
            toplamTutar+=2;
            System.out.println("odemeniz gereken tutar : " + toplamTutar + "£");
        }

        System.out.println("lutfen makineye (tam paralardan) tutari atiniz ve islemi baslatiniz ");
        int atilanPara=scan.nextInt();
     if (atilanPara<toplamTutar) {
         System.out.println("lutfen " + (toplamTutar-atilanPara) + " £ kadar ekleme yapiniz ");
     } else if (atilanPara==toplamTutar){
         System.out.println("afiyet olsun");

     } else if (atilanPara>toplamTutar){
         System.out.println("lutfen " + (atilanPara-toplamTutar) + " £ para ustunuzu aliniz");
     }
        System.out.println("islemi sonlandirmak icin H ve devam etmek icin E ye basiniz");
     String dugme=scan.next().toUpperCase();
     if (dugme.equalsIgnoreCase("H")) {
         System.out.println("tesekkurler tekrar bekleriz");
         System.exit(0);}
         else if (dugme.equalsIgnoreCase("E")) {
         kahveseciniz();



     }
    }
}
