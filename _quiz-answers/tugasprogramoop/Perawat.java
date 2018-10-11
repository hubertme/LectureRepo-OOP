public class Perawat extends Pegawai{
    
    private int jumlah_kehadiran;
    private final int TARIF_HARIAN = 250000;
    
    public Perawat(){
        
    }
 
    public Perawat(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }    
    
    public void setKehadiran(int jumlah_kehadiran){
        this.jumlah_kehadiran = jumlah_kehadiran;
    }
    
    // @Override
    public int getGaji(){
        int total_gaji = jumlah_kehadiran*TARIF_HARIAN;       
        return total_gaji+gajiAwal;
    }
}