package ogrenci_veritabani_uygulamasi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci_Veritabani {
    public static void main(String[] args) {
//        Ogrenci ogr = new Ogrenci();
//        ogr.ogrenciNoBelirle();
//        ogr.dersKaydi();
//        System.out.println(ogr.toString());

        // Kaç öğrenci eklemek istediğini sor
        Scanner input = new Scanner(System.in);
//        System.out.print("Kaç öğrenci eklemek istersiniz: ");
//        int ogrenciAdedi = input.nextInt();
//        Ogrenci[] ogrenci = new Ogrenci[ogrenciAdedi];

        List<Ogrenci> ogr = new ArrayList<>();

        // n sayısında yeni öğrenci oluştur
//        for (int i = 0; i < ogrenciAdedi; i++){
//            ogrenci[i] = new Ogrenci();
//            ogrenci[i].ogrenciNoBelirle();
//            ogrenci[i].dersKaydi();
//            ogrenci[i].odemeMitari();
//            System.out.println(ogrenci[i].toString());
//        }
        int i = 0;
        while (true){
            System.out.println("---------Ders Kayıt Ekranına Hoşgeldiniz---------\n");
            ogr.add(new Ogrenci());
            ogr.get(i).ogrenciNoBelirle();
            ogr.get(i).dersKaydi();
            ogr.get(i).odemeMitari();
            System.out.println("--------------------------");
            System.out.println("Devam etmek için D'ye basınız\nÇıkış için X'e basınız: ");
            String cikis = input.next().toUpperCase();
            if(cikis.equals("X")){
                break;
            } else
                i++;
        }

//        for (Ogrenci w:ogr){
//            w = new Ogrenci();
//            w.ogrenciNoBelirle();
//            w.dersKaydi();
//            w.odemeMitari();
//        }

    }




    /*
Uygulamanızın aşağıdaki işlemleri yapması gerekiyor:

Kullanıcıya, veritabanına kaç öğrencinin ekleneceğini sormalı
Kullanıcı her öğrenci için isim, soy isim ve yıl (kaçıncı sınıf) seçeneği bilgilerini girmeli
Her öğrenci 5 haneli sayısal ve eşsiz bir öğrenci numarasına sahip olmalı ve bu numaranın ilk sayısı, öğrencinin yıl bilgisi olmalı
Öğrenciler aşağıdaki derslerden istediklerine kayıt olabilirler:
    Tarih 101
    Matematik 103
    İngilizce 105
    Kimya 107
    Bilgisayar Bilimleri 109
Her ders için kayıt ücreti 600 TL olmalı
Öğrenciler dersleri seçtikten sonra toplam kurs ücretini görebilmeli ve kaç TL ödeme yapacağını yazabilmeli
Kayıt tamamlandıktan sonra ekranda öğrencilerin son durumlarını, aşağıdaki bilgileri içerecek şekilde görmeliyiz:
İsim Soyisim :
Öğrenci no :
Yıl :
Kayıt olunan dersler :
Kalan borç :

 */
}
