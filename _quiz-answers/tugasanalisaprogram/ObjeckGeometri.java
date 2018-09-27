class ObjeckGeometri {
    
    private String warna = "putih";
    private boolean terisi;
    private java.util.Date TanggalDiciptakan;
    
    /** Menciptakan suatu objek Geometri Default */
    public ObjeckGeometri() {
        TanggalDiciptakan = new java.util.Date();
    }
    
    /** Menciptakan suatu objek Geometri dengan warna dan
     * nilai terisi tertentu */
    public ObjeckGeometri (String warna, Boolean terisi) {
        TanggalDiciptakan = new java.util.Date();
        this.warna = warna;
        this.terisi = terisi;
    }
    
    /** Mengembalikan warna */
    public String dapatWarna () {
        return warna;
    }
    
    /** Menetapkan suatu warna baru */
    public void dapatWarna (String warna){
        this.warna = warna;
    }
    
    /** Mengembalikan terisi.karena terisi adalah suatu boolean, metode dapat dinamai apaTerisi */
    
    public boolean apaTerisi() {
        return terisi;
    }
    
    /** Menetapkan suatu nilai terisi yang baru */
    
    public void tetapkanTerisi (boolean terisi) {
        this.terisi = terisi;
    }
    
    /** Mendapatkan tanggalDiciptakan */
    
    public java.util.Date dapatTanggalDiciptakan() {
        return TanggalDiciptakan;
    }
    
    /** Mengembalikan suatu representasi string atas objek ini */
    
    
    public String keString() {
        return "diciptakan pada " + TanggalDiciptakan + "\nwarna: " + warna + " dan nilai terisi : + terisi";
    }
}
