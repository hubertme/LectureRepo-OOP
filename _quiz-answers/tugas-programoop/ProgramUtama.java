public class ProgramUtama {

    public static void main(String[] args) {
        
        Perawat s1 = new Perawat();
        s1.setNama("Putu");
        s1.setKehadiran(20);
        
        Dokter d1 = new Dokter();
        d1.setNama("Max");
        d1.setPasien(12);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Albert");
        
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}