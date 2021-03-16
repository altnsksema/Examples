import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class escape {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int num2= scan.nextInt();


        System.out.println("toplam: " + (num1 + num2));

        
    }
    
}
