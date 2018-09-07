// extends -> Inheritance
public class Anak extends Induk{
	String sifatAnak;

	protected void setSifatAnak(String sender){
		this.sifatAnak = sender;
	}

	public static void main(String[] args) {
		String sifatInduk = "Pemarah";
		String sifatAnak = "Ramah";
		Anak myAnak = new Anak();
		myAnak.setSifatAnak(sifatAnak);
		myAnak.setSifatInduk(sifatInduk);
		System.out.format("Sifat induk: %s\nSifat anak: %s\n",myAnak.sifatInduk,myAnak.sifatAnak);
	}
}