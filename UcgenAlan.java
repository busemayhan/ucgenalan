package Giris;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        //รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข
        // ๐ข = (a+b+c) / 2
        //Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
    Scanner input=new Scanner(System.in);
    int a,b,c,u;
    System.out.print("a sayisini giriniz: ");
    a=input.nextInt();
    System.out.print("b sayisini giriniz: ");
    b=input.nextInt();
    System.out.print("c sayisini giriniz: ");
    c=input.nextInt();

    u=(a+b+c)/2;
    System.out.println("u = "+u);
    double alan;

    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.print("alan = "+alan);



    }






}
