package Giris;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        // 𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
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
