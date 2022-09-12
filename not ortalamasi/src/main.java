import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp =new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat=inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce=inp.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih=inp.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik=inp.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;
        String btl=(sonuc>60)?"Geçtiniz":"Kaldınız";
        System.out.println("not ortalamanız: " + sonuc + btl);



    }


}
