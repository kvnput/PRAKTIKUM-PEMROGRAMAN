/* Pegawai class*/

package prak203_2110817120006_putrioktavianti;

public class Pegawai {
    public String nama;
/*  char hanya menampung 1 karakter saja, string bisa banyak
    public char asal; 
*/
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
/*  Parameternya tidak di isi (Parameter adalah variabel yang menampung nilai untuk diproses di dalam fungsi)
    public void setJabatan() {
      this.jabatan = j;
    }
*/
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}