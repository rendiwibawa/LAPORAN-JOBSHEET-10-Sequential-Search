package jobsheet10;

import java.util.Scanner;

public class latihan_praktikum2 {
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int []{9,90,56,90,87,76,42};
        Scanner ren = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin di cari");
        cari = ren.nextInt();
        for (int i=0;i< data.length;i++){
        if(cari == data[i]){
        found=true;
            System.out.println("Data di temukan pada indeks ke-" +i);
        }
      }
  if (found != true){System.out.println("Data tidak di temukan !");}
    }
    
}
