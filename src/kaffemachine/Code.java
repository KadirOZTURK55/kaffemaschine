package kaffemachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to cafe-House");

        System.out.println("please slot coin to machine");
        double para = scanner.nextDouble();
        scanner.nextLine();

        boolean flag = true;
        List<String> liste = new ArrayList<>();
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;  //buradaki numaralar; List of preis daki numaralara karsilik gelen sayilardir.
        // sonucundaki methodda belirlenen tutar karsiligi yani mesela middle sectik ve bunun icin 2 ye bastik
        //sonuc olarak bize bir deger donecek ve biz bu tutari hesap yaparken kullanacagiz
        double number4 = 0;
        double number5 = 0;
        double number6 = 0;
        double number7 = 0;


        while (flag) {

            int number = scanner.nextInt();//buradan mesela 1 i sectim americano geldi
            scanner.nextLine();
            switch (number) {
                case 1:
                    ListofPreis.AmericanoPreis(); // BURADA KAHVENIN BUYUKLUGUNUN FIYATINI GOSTERIYOR
                    System.out.println("select size according to preis");
                    int numberA = scanner.nextInt(); //buradan kahvenin buyuklugu baglaminda mesela big secmek icin 3 e bastim
                    //NUMBER A; kahvenin size'ini secerken kullandigimiz bir sayi... bu sayi hesaplama icin dolayli olarak kullaniliyor...
                    //yani bir sonraki methodda hesaplama yapilirken arraydeki kahve boyutunun ucretini gosterirken index i belirlemede kullaniliyor
                    scanner.nextLine();
                    //simdi ise yukarida gecen NUMBERA ifadesini asagidaki methoda otomatik olarak aktariyoruz
                    number1 = SizePreis.sizePreisOfAmericano(numberA);
                    //USTTE 42. SATIRDA ISE HESABINI YAPIYOR VE CIKTI OLARAK HESAPLANAN UCRETI NUMBER 1 E AKTARIOR
                    para -= number1; //kalan parayi hesaplamak icin number1 i paradan cikartiyor
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 2:
                    ListofPreis.CappucinoPreis();
                    System.out.println("select size according to preis");
                    int numberB = scanner.nextInt();
                    scanner.nextLine();
                    number2 = SizePreis.sizePreisOfCappucino(numberB);
                    para -= number2;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 3:
                    ListofPreis.EspressoPreis();
                    System.out.println("select size according to preis");
                    int numberC = scanner.nextInt();
                    scanner.nextLine();
                    number3 = SizePreis.sizePreisOfEspresso(numberC);
                    para -= number3;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 4:
                    ListofPreis.LattePreis();
                    System.out.println("select size according to preis");
                    int numberD = scanner.nextInt();
                    scanner.nextLine();
                    number4 = SizePreis.sizePreisOfEspresso(numberD);
                    para -= number4;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 5:
                    ListofPreis.MochaPreis();
                    System.out.println("select size according to preis");
                    int numberE = scanner.nextInt();
                    scanner.nextLine();
                    number5 = SizePreis.sizePreisOfMocha(numberE);
                    para -= number5;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 6:
                    ListofPreis.MacchiatoPreis();
                    System.out.println("select size according to preis");
                    int numberF = scanner.nextInt();
                    scanner.nextLine();
                    number6 = SizePreis.sizePreisOfMacchiato(numberF);
                    para -= number6;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                case 7:
                    ListofPreis.decaf();
                    System.out.println("select size according to preis");
                    int numberG = scanner.nextInt();
                    scanner.nextLine();
                    number7 = SizePreis.sizePreisOfDecaf(numberG);
                    para -= number7;
                    System.out.println("rest coins: " + (para) + " euro");
                    break;
                default:
                    System.out.println("error");

            }
            if (para > 1.00) {
                System.out.println("Do you wanna order more?" +
                        "\nyes or no");
                String cikis = scanner.next();
                if (cikis.equalsIgnoreCase("n")) {
                    flag = false;
                }

            } else if (para < 1.00) {
                System.out.println("if you wanna go on please charge the coins" +
                        "\nyes or no");
                String cikis = scanner.next();
                if (cikis.equalsIgnoreCase("n")) {
                    flag = false;
                } else {
                    System.out.println("please slot coin to machine");
                    para += scanner.nextDouble();
                    scanner.nextLine();
                }

            }

        }
        System.out.println("Enjoy your coffee, we'll see you again");
    }
}
