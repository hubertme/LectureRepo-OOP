public class Pegawai implements Gaji{
 
    private String nip;
    private String nama;
    private String alamat;
    
    public Pegawai(){
        
    }
 
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getGaji(){        
        return gajiAwal;
    }
}