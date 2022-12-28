import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int mat, fizik, kimya, turkce, tarih ,muzik;
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik= input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya= input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce= input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih= input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik  = input.nextInt();

        int Toplam= mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc= Toplam/6.0;

        System.out.println("Ortalamanız: "+ sonuc);
        String durum = sonuc>=60? "Geçtiniz.":"Kaldınız.";
        System.out.print("Durum: "+durum);


    }
}