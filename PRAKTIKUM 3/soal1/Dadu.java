/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class Dadu {
    public int input;
    public int min = 1;
    public int max = 6;
    int total;

//    Encapsulation
    public void setInput(int input){this.input = input;}

    void acakNilai(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);ll.add(2);ll.add(3);ll.add(4);ll.add(5);ll.add(6);
        for (int i = 0; i < input; i++){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ random_int);
            total += random_int;
        }
        System.out.println("Total Nilai Dadu Keseluruhan " + total);
    }
}