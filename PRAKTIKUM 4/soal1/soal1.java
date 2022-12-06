/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//main
package praktikum4.soal1;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a, b;
        int c;
        
        inp.next();
        a = inp.nextLine();
        inp.next();
        b = inp.nextLine();
        inp.next();
        inp.next();
        c = inp.nextInt();
        buku book = new buku(a, b, c);
        book.display();
    }
}
