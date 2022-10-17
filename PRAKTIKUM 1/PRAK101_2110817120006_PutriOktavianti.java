// Nomor 1

import java.util.Scanner;
public class PRAK101_2110817120006_PutriOktavianti {
    public static void main (String [] args) {
        Scanner scan=new Scanner(System.in);
     
        String Nama,TempatLahir,TanggalLahir, Bulan = null;
        int BulanLahir, TahunLahir,TinggiBadan, BeratBadan;
       
        System.out.print("\tMasukan Nama Lengkap\t:");
        Nama=scan.nextLine();
        
        System.out.print("\tMasukan Tempat Lahir\t: ");
        TempatLahir=scan.nextLine();
        
        System.out.print("\tMasukan Tanggal Lahir\t: ");
        TanggalLahir=scan.nextLine();
       
        System.out.print("\tMasukan Bulan Lahir\t: ");
        BulanLahir=scan.nextInt();
        
        if (BulanLahir == 1) Bulan ="Januari";
        else if (BulanLahir == 2) Bulan ="Februari";
        else if (BulanLahir == 3) Bulan ="Maret"; 
        else if (BulanLahir == 4) Bulan ="April";
        else if (BulanLahir == 5) Bulan ="Mei";
        else if (BulanLahir == 6) Bulan ="Juni";
        else if (BulanLahir == 7) Bulan ="Juli";
        else if (BulanLahir == 8) Bulan ="Agustus";
        else if (BulanLahir == 9) Bulan ="September";
        else if (BulanLahir == 10) Bulan ="Oktober";
        else if (BulanLahir == 11) Bulan ="November";
        else if (BulanLahir == 12) Bulan ="Desember";

       
        System.out.print("\tMasukan Tahun Lahir\t: ");
        TahunLahir=scan.nextInt();
        
        System.out.print("\tMasukkan Tinggi Badan\t: ");
        TinggiBadan=scan.nextInt();
        
        System.out.print("\tMasukan Berat Badan \t: ");
        BeratBadan=scan.nextInt();

        System.out.println();
        System.out.println("\tData Telah Ditambahkan,\t");
        System.out.print("\tNama Lengkap "+Nama+",");
        System.out.println(" Lahir di "+TempatLahir+" pada tanggal "+TanggalLahir+" "+Bulan+" "+TahunLahir);
        System.out.println("\tTinggi Badan "+TinggiBadan+" cm dan Berat Badan "+BeratBadan+" kilogram");
    }
}
