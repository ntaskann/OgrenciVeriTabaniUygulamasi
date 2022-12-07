package ogrenci_veritabani_uygulamasi;

import java.util.Scanner;

public class Ogrenci {

    // Variable’lar
    private String ilkIsim;
    private String soyIsim;
    private int yil;
    private String ogrenciNo;
    private String dersler = "";
    private int toplamBorc;
    private int dersUcreti = 600;
    private static int id = 1000;
    int sayac = 1;

    // Constructor: İsim, soyisim ve yıl bilgisini al
    public Ogrenci() {
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        this.ilkIsim = input.nextLine();

        System.out.print("Soyisminizi giriniz: ");
        this.soyIsim = input.nextLine();

        System.out.print("Kaçıncı sınıftasınız: ");
        this.yil = input.nextInt();
    }


    // Öğrenci no oluştur
    public void ogrenciNoBelirle() {
        id++;
        this.ogrenciNo = id +""+ yil;
        System.out.println("Öğrenci Numaranız: " + ogrenciNo);
    }

    // Derse kayıt ol
    public void dersKaydi() {
        boolean flag = true;
        System.out.println("-----------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("DERS LİSTESİ:" +
                "\n\t101 Tarih" +
                "\n\t103 Matematik" +
                "\n\t105 İngilizce" +
                "\n\t107 Kimya" +
                "\n\t109 Bilgisayar Bilimleri");
        do {
            System.out.println("Seçmek istediğiniz dersin kodunu giriniz veya çıkış için X'e basınız: ");
            String ders = input.next().toUpperCase();
            switch (ders) {
                case "101":
                    dersler = dersler + sayac +"- Tarih \n";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    borcuGoster();
                    sayac++;
                    break;
                case "103":
                    dersler = dersler + sayac + "- Matematik \n";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    borcuGoster();
                    sayac++;
                    break;
                case "105":
                    dersler = dersler + sayac + "- İngilizce \n";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    borcuGoster();
                    sayac++;
                    break;
                case "107":
                    dersler = dersler + sayac + "- Kimya \n";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    borcuGoster();
                    sayac++;
                    break;
                case "109":
                    dersler = dersler + sayac + "- Bilgisayar Bilimleri \n";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    borcuGoster();
                    sayac++;
                    break;
                case "X":
                    flag = false;
                    break;
                default:
                    System.out.println("Geçersiz işlem yaptınız.");
                    dersKaydi();
            }
        }
        while (flag);
        System.out.println("Seçilen Dersler: " + dersler);
        System.out.println("Toplam Borcunuz: " + toplamBorc + "TL");
    }


// Toplam borcu görüntüle
    public void borcuGoster(){
        toplamBorc = toplamBorc + dersUcreti;
        System.out.println("Toplam Borcunuz: " + toplamBorc + "TL");
    }

// Öğrenciye ne kadar ödeme yapacağını sor ve hesapla
    public void odemeMitari() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ödeyeceğiniz miktarı giriniz: ");
        int odeme = input.nextInt();
        toplamBorc = toplamBorc - odeme;
        System.out.println("Ödeme yaptığınız tutar: " + odeme + " TL'dir.");
        System.out.println("Kalan borcunuz: " + toplamBorc + " TL");
    }

// Kayıttan sonra ekranda son durumu göster

    @Override
    public String toString() {
        return "İsim Soyisim: " + ilkIsim + " " +soyIsim +"\n"+
                "Yıl: " + yil +"\n"+
                "Öğrenci no: " + ogrenciNo +"\n"+
                "Kayıt olunan dersler: " + dersler +"\n"+
                "Kalan borç: " + toplamBorc;
    }
}





