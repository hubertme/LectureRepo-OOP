public class Dokter extends Pegawai{
 
    private int jumlahPasien;
    private final int TARIF_Pasien = 150000;
    
    public Dokter(){
        
    }
 
    public Dokter(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setPasien(int Pasien){
        this.jumlahPasien = Pasien;
    }
    
    // @Override
    public int getGaji(){
        int total_gaji = jumlahPasien*TARIF_Pasien;
        return total_gaji+gajiAwal;
    }
}