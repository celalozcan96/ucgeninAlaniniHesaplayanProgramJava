package JavaOdev3;

import java.util.Scanner;

//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

public class pisagorTeoremi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int a,b,c;
        double cevre;
        double u;
        double alan;

        System.out.print("a Kenarının Uzunluğunu Giriniz:");
        a = girdi.nextInt();
        System.out.print("b Kenarının Uzunluğunu Giriniz:");
        b = girdi.nextInt();
        System.out.print("c Kenarının Uzunluğunu Giriniz:");
        c = girdi.nextInt();
    
        cevre = (a+b+c);
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u -c));

        System.out.println("Çevre:" + cevre);
        System.out.println("Alan:" + alan);



    

        

    }
    
}
