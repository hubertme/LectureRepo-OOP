class UjiLingkaranPersegiPanjang {
    public static void main (String[] args){
        Lingkaran4 lingkaran = new Lingkaran4(1.00);
        System.out.println ("Lingkaran "+ lingkaran.keString ());
        System.out.println ("Radius sebesar "+ lingkaran.dapatRadius ());
        System.out.println ("Luas sebesar "+ lingkaran.dapatLuas ());
        System.out.println ("Diameter sebesar "+ lingkaran.dapatDiameter ());
        
        PersegiPanjang1 PersegiPanjang1 = new PersegiPanjang1 (2, 4);
        System.out.println ("\nPersegi-panjang"+ PersegiPanjang1.keString ());
        System.out.println ("Luas Sebesar "+ PersegiPanjang1.dapatLuas ());
        System.out.println ("Keliling Sebesar "+ PersegiPanjang1.dapatKeliling ());
    }
}
