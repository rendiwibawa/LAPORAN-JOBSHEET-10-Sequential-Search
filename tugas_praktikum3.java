package tugas_praktikum_array;
import java.util.Scanner;
public class tugas_praktikum3 {
    public static void main(String[] args) {
        int angka=0;
        int []data= new int[]{92,98,76,72,84,101,39};//ini untuk menampilkan data ini ke output
        System.out.print("Nilai pada array :");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");}
        
        System.out.println("\n");//lah disisnilah program terpenting yaitu memisahkan data yang berkelipatan 3 atau yang tidak
        System.out.print("Nilai kelipatan 3 :");
        System.out.println("\n");
       for(int a=0;a<data.length;a++){if (data[a]%3==0){//dan perintah untuk menampilkan data kelipatan 3 adalah % dan akan di cocokan untuk semua data dengan metode for
     
       System.out.println("=>"+data[a]+" ");} //ini adalah perintah output data harus di dalam kurung kurawa agar mengeluarkan program yang telah di proses
       
       }System.out.println("\n");//ini untuk mengebawahkan kata2 BUILD SUCCESFULL
        
    }
}    
    
