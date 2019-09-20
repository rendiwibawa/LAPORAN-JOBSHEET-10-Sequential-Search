package tugas_praktikum_array;

import java.util.Scanner;

public class tugas_praktikum1 {
    public static void main(String[] args) {
       Scanner ren= new Scanner(System.in);
       int angka = 0;//ini inisialisasi variable yang akan di gunakan 
       int cari;
       int [] data= new int[]{74,98,72,74,72,90,81,72};//cara menampilkan data yang di maksukan dalam array
       System.out.println("Data pada array: ");
       for (int i=0;i<data.length;i++){
       System.out.print(data[i]+"\t");
       
}
       System.out.println("\nMasukkan data yang dicari : ");/*user di suruh menginputkan data yang akan di cocokan dengan data di
                                                              dan setelah di coc*/
       cari = ren.nextInt();                                
       
        for (int a=0;a<data.length;a++){
            if(cari==data[a]){
                angka++;/*menhitung data yang di temukan jadi setelah user menginputkan suatu angka akan di teruskan ke sini dan
                          data akan di cocokan di sini saya menggunakan variable a untuk memproses data ini kemudian setelah di cocokan maka
                            data akan di samakan dengan perintah IF yaitu cari==data[a] lalu untuk menampilkan berapa banyak data yang di temukan 
                            menggunakan variable angka++*/
            }
        }System.out.println("Data ditemukan sebanyak " + angka + " kali");//ini untuk mengeluarkan hasil dari proses di atas
    }        
}
    

