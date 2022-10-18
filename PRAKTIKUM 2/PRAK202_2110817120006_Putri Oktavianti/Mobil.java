package prak202_2110817120006_putri.oktavianti;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;
    private int pajak;
    
    /*
    public Mobil(String m, String thn,int kps, int h){
        merek = m;
        tahun_keluaran = thn;
        kapasitas = kps;
        harga = h;
    }
    */
    public Mobil(){
        
    }
    public void setPemilik(String pm){
        pemilik = pm;    
    }
    public void setPajak(int pjk){
        pajak = pjk;
    }
    
    
    
    public String getPemilik (){
        return pemilik;
    }
    public int getPajak(){ 
        
        return pajak = (harga*2)/100;
    } 
    
    
    public void info(){
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Merek Mobil: " + merek);
        System.out.printf("Harga: %s %n", kursIndonesia.format(harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas +"cc");
       
    }
}