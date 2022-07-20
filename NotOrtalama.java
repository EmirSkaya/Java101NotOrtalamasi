import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        //Değişkenleri Tanımla
        int mat , turkce , kimya , fizik , tarih , muzik ;

        //Scanner
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan Veri Alma
        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.println("Turkce Notunuz:");
        turkce = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz");
        muzik = inp.nextInt();

        //Notların Aritmetik Ortalamasını Al
        int toplam = (mat+tarih+turkce+kimya+fizik+muzik);
        double sonuc = toplam / 6.0 ;

        //Ortalamayı Ekrana Yazdır
        System.out.println("Ortalamaniz:"+ sonuc);

        //Geçme Kalma Belge Koşullarını Belirt
        boolean kosul  = sonuc >= 50 ;
        boolean kosul2 = sonuc >= 70 ;

        String sinif = kosul  ? "Sinifi Gectin" : "Sinifta Kaldin";
        String belge = kosul2 ? "Belge Almaya Hak Kazandin" : "";

        //Sınıfı Geçme Kalma Bilgisi
        System.out.println(sinif);
        System.out.println(belge);
    }
}
