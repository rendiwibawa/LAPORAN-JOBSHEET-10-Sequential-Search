package jobsheet10;
import java.util.Scanner;
public class latihan_praktikum1 {
    public static void main(String[] args) {
     String cari;
     boolean found = false;
     String[]data= new String[]{"rujak","pecel","soto","gudeg"};
     Scanner ren = new Scanner (System.in);   
     System.out.println("Masukan nama makanan yang anda inginkan : ");
     cari=ren.next();
     for (String data1: data){
     if (cari == null ? data1== null : cari.equals(data1)){
     found = true;
     break;
     }
     }
    
  if (found == true){
            System.out.println("Data makanan ditemukan");
}else {
      System.out.println("Data tidak di temukan");
}

}
    
}