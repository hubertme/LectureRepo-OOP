class PersegiPanjang1 extends ObjeckGeometri{
    
    private double lebar;
    private double tinggi;
    
    public PersegiPanjang1 (double lebar,double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public PersegiPanjang1(double lebar, double tinggi, String warna, boolean terisi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
        //ObjeckGeometri og = new ObjeckGeometri1();
        dapatWarna ();
        apaTerisi ();
    }
    
    /**Mengembalikan lebar */
    public double dapatLebar(){
        return lebar;
    }
    
    /**Menetapkan suatu lebar baru */
    public void dapatLebar(double lebar){
        this.lebar = lebar;
    }
    
    /** Mengembalikan Tinggi */
    
    public double dapatTinggi(){
        return tinggi;
    }
    
    /**Menetapkan suatu tinggi baru */
    public void tetapkanTinggi (double tinggi) {
        this.tinggi = tinggi;
    }
    
    /**Mengembalikan Luas */
    
    public double dapatLuas() {
        return lebar * tinggi;
    }
    
    /**Mengembalikan Keliling persegi-panjang */
    public double dapatKeliling() {
        return 2 * (lebar + tinggi);
    }
}
