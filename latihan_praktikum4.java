package jobsheet10;
import java.util.Scanner;
public class latihan_praktikum4 {
    public static void main(String[] args) {
        Scanner ren= new Scanner(System.in);
        String cari;
        System.out.println("Massukan sebuah kata/kalimat: ");
        cari=ren.nextLine();
        
        int a=0;
        for(int i=0 ;i<cari.length();i++){
        if(cari.charAt(i)=='a'){a++;
                }
            }System.out.println("Jumlah huruf (a) pada kalimat di atas adalah "+a);
    }
    
}
