package prak201_2110817120006_putri.oktavianti;

public class prak201_main {

   public static void main(String[] args){
        prak201_class Arumanis = new prak201_class("Arumanis",5000,0.3f,13);
        prak201_class Manalagi = new prak201_class("Manalagi",7500,0.5f,17);
        prak201_class ManggaMadu = new prak201_class("Mangga Madu",6500,0.375f,12);
        
        
        Arumanis.resi();
        System.out.println("");
        Manalagi.resi();
        System.out.println("");
        ManggaMadu.resi();
    }
    
}
