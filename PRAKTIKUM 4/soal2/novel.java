/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//class novel
package praktikum4.soal2;

public class novel extends buku{
    private String genre, sinopsis;

    public novel (String j, String p, String t, String g, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre = g;
        this.sinopsis = s;
    }
    public String getNovelDetail(){
        return "Data yang baru di inputkan adalah\nSebuah novel bergenre Drama dengan judul " + judul
        + " .\nNovel  tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun
        + " . \nSinopsis : " + sinopsis.substring(0, 59) + "...";
    }
}