//Nomor 4

import java.util.Scanner;
public class PRAK104_2110817120006_PutriOktavianti {
    public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
       
       int AndiPertama, BudiPertama, AndiKedua, BudiKedua, AndiKetiga, BudiKetiga;
       int AngkaAndi = 0, AngkaBudi= 0;
       
       System.out.println("---INPUT---");
       System.out.print("Kartu Andi: ");
       AndiPertama = keyboard.nextInt();
       AndiKedua = keyboard.nextInt();
       AndiKetiga = keyboard.nextInt();
       keyboard.nextLine();
       int [] andi = {AndiPertama, AndiKedua, AndiKetiga};
       
       System.out.print("Kartu Budi: ");
       BudiPertama = keyboard.nextInt();
       BudiKedua = keyboard.nextInt();
       BudiKetiga = keyboard.nextInt();
       keyboard.nextLine();
       int [] budi = {BudiPertama, BudiKedua, BudiKetiga};
       
       if ((BudiPertama >= 2 && BudiPertama <= 10) && (BudiKedua >= 2 && BudiKedua <= 10)&& (BudiKetiga >= 2 && BudiKetiga <= 10)&&
               (AndiPertama >= 2 && AndiPertama <= 10) && (AndiKedua >= 2 && AndiKedua <= 10)&& (AndiKetiga >= 2 && AndiKetiga <= 10)) {
           int i = 0;
           while (i <= 2) {
               if (andi[i]>budi[i]) {
                   AngkaAndi++;
               } else if (budi[i]>andi[i]) {
                   AngkaBudi++;
               }
               i++;
           }
           System.out.println("---OUTPUT---");
           if (AngkaAndi>AngkaBudi) {
               System.out.println("Andi");
               }
           if (AngkaAndi<AngkaBudi) {
               System.out.println("Budi");
               }
           if (AngkaAndi==AngkaBudi) {
               System.out.println("Seri");
               }
                   
               }
           }
     
    }