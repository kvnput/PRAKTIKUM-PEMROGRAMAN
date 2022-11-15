/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//class 
package praktikum4.soal1;

public class buku {
    private String judul, penulis;
    private int tahun;

    public buku(String j, String p, int t) {
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }

    public void display(){
        System.out.println("Detail Buku :");
        System.out.println("Judul adalah " + judul);
        System.out.println("penulis adalah" + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}