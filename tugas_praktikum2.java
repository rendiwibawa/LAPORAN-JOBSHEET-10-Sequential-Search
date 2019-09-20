package tugas_praktikum_array;
public class tugas_praktikum2 {
    public static void main(String[] args) {
        int angka=0;
        int []data=new int[]{83,76,45,90,85,80,78,74};//program ini untuk menampilkan angka yang telah di initialize dan di tampilkan
         System.out.println("Data pada array: ");
        for (int i=0;i<data.length;i++){
    System.out.print(data[i]+"\t");
    
}double rata = 0;                                      //ini untuk menghitung rata-rata dari data array di atas
for(int a=0;a<data.length;a++)rata+=data[a];
rata/=data.length;
        System.out.print("\nRata-Rata nilai array :"+rata);//lah disini saya mengout print kan di atas nya for supaya tulisan ini tidak berulang ulang 
        System.out.println("\n");
        System.out.println("Nilai yang di atas rata-rata :");
        
for(int p=0;p<data.length;p++){if(data[p]>rata){/*di sinilah program memproses mengeluarkan angka yang di atas rata-rata dari program sebelumnya
                                                jadi cara mengeluarkan data di atas rata rata dengan membuat data [p]kemudian di kasih perintah
                                                data[p]>rata maka data ini akan mengecek setiap datayang di inputkan di atas dan mengeluarkan 
                                                data nilai yang lebih dari rata-rata itu tadi*/
    System.out.print(data[p]+"\t");}} //ini akan menampilkan data tertinggi yang telah di proses di atas     
    System.out.println("\n");    //ini untuk membuat baris baru dari kata2 succses 
    }
    
}
