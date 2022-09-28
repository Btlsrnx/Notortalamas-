import java.util.Scanner;
public class KENARORT {
    public static void main(String[]args){
        int a,b,c;
        double alan,u;
        Scanner giris=new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz :");
        a=giris.nextInt();
        System.out.print("2.Kenarı Giriniz :");
        b=giris.nextInt();
        System.out.print("3.Kenarı Giriniz :");
        c=giris.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı :"+alan);
    }  }
