import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi ;
        double gidisDonusBiletIndirimi, yasIndirimi, indirimliTutar,toplamTutar ;
        double normalTutar = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2 :");
        yolculukTipi = input.nextInt();

//HATALİ GİRİŞ
        if(mesafe <= 0){
            System.out.print("Hatalı Giriş Yaptınız.");
        }
        else if(yas <= 0){
            System.out.print("Hatalı Giriş Yaptınız.");
        }
        else if(yolculukTipi!=1 && yolculukTipi!=2){
            System.out.print("Hatalı Giriş Yaptınız.");
        }
        else{
            normalTutar = mesafe * 0.10;
        }

//YAŞ İNDİRİMİ
        if(yas < 12){
            yasIndirimi = normalTutar * 0.50;
        }
        else if(yas >= 12 && yas <24){
            yasIndirimi = normalTutar * 0.10;
        }
        else if(yas > 65){
            yasIndirimi= normalTutar * 0.30;
        }
        else {
            yasIndirimi = 0;
        }

        indirimliTutar = normalTutar - yasIndirimi;

//GİDİŞ DÖNÜŞ BİLET İNDİRİRİMİ
        if(yolculukTipi == 2){
            gidisDonusBiletIndirimi = indirimliTutar * 0.20;
        }
        else{
            gidisDonusBiletIndirimi = 0;
        }

        toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi)*yolculukTipi;
        System.out.println("Toplam Tutar : " + toplamTutar + "TL");

    }
}
