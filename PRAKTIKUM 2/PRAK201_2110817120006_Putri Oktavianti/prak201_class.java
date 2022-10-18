package prak201_2110817120006_putri.oktavianti;

public class prak201_class {
    String nama;
    float berat;
    int beli;
    int harga;
    
/*
    public prak201_class (String n, int h, float br, int bl){
        nama = n;
        harga = h;
        berat = br;
        beli = bl;
    }
*/  
    
    public void resi (){
        System.out.println("Nama Mangga : " + nama);
        System.out.println("Berat : " + berat +" kg");
        System.out.println("Jumlah Beli : " + beli);
        System.out.println("Total Berat : " + (berat*beli)+ " kg");
        System.out.println("Total harga : Rp."+ (harga*beli) );
    }
}
