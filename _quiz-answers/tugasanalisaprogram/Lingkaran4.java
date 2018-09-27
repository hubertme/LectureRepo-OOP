class Lingkaran4 extends ObjeckGeometri{
    
    private double radius;
    
    public Lingkaran4 (double radius) {
        this.radius = radius;
    }
    
    public Lingkaran4 (double radius, String Warna, boolean terisi) {
        this.radius = radius;
        dapatWarna ();
        tetapkanTerisi(terisi);
    }
    
    /** Mengembalikan radius */
    public double dapatRadius() {
        return radius;
    }
    
    /** Menetapkan suatu radius baru */
    public void tetapkanRadius (double radius) {
        this.radius = radius;
    }
    
    
    /** Mengembalikan luas */
    
    public double dapatLuas() {
        return radius * radius * Math.PI;
    }
    
    /** Mengembalikan Diameter */
    public double dapatDiameter(){
        return 2 * radius;
    }
    
    /**Mengembalikan Keliling */
    public double dapatKeliling(){
        return 2 * radius * Math.PI;
    }
    
    /* Menampilkan informasi Lingkaran */
    
    public void tampilLingkaran () {
        System.out.println("Lingkaran diciptakan pada "+ dapatTanggalDiciptakan()+ " dan radiusnya adalah " + radius);
    }
}

