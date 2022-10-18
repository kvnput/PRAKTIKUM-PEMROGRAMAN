/* Soal3Main */

package prak203_2110817120006_putrioktavianti;

import java.util.Scanner;

public class Soal3Main {
    
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
/*      Pada baris ini terjadi error karena kurangnya titik koma (;)
        p1.nama = "Roi"
*/
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
/*      integer umurnya belum diisi */

        p1.umur = 17;
/*      
        Di output soal tidak memakai "Nama Pegawai", tetapi memakai "Nama"
        System.out.println("Nama Pegawai: " + p1.getNama());
*/
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
/*      
        Di belakang 17, tertinggal kata "tahun"
        System.out.println("Umur: " + p1.umur);
*/
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}