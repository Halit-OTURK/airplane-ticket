package blanks;

import java.util.Scanner;

public class airplane_ticket {
    public static void main(String[] args) {
        int km,yas,tip,normalucret,yasucret,indirimliucret,gducret,toplam;

        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = sc.nextInt();
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = sc.nextInt();

        normalucret = (int) (km * 0.10);

        if (yas < 12){
            yasucret = (int) (normalucret * (0.50));
            System.out.println("Yaş İndirimi : " + yasucret);
            toplam = normalucret - yasucret;
            System.out.println("Toplam tutar: " + toplam);
        }else if (yas >= 12 && yas <= 24){
            yasucret = (int) (normalucret * (0.10));
            System.out.println("Yaş İndirimi : " + yasucret);
            toplam = normalucret - yasucret;
            System.out.println("Toplam tutar: " + toplam);
        }else if (yas >= 65){
            yasucret = (int) (normalucret * (0.30));
            System.out.println("Yaş İndirimi : " + yasucret);
            toplam = normalucret - yasucret;
            System.out.println("Toplam tutar: " + toplam);
        }


        else if (tip == 1){
            normalucret = (int) (km * 0.10);
            System.out.println("Toplam tutar: " + normalucret);

        }else if (tip == 2){
            gducret = (int) (normalucret  * (0.20));
            toplam = normalucret - gducret;
            System.out.println("Gidiş Dönüş Bilet İndirimi: " + gducret);
            System.out.println("Toplam tutar: " + toplam);
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
