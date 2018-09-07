// extends -> Inheritance
public class Anak extends Induk{
	String sifatAnak;
	static Anak myAnak = new Anak();

	protected void setSifatAnak(String sender){
		this.sifatAnak = sender;
	}

	static void gantiSifatAnakDanInduk(String sifatInduk, String sifatAnak){
		myAnak.setSifatAnak(sifatAnak);
		myAnak.setSifatInduk(sifatInduk);

		System.out.format("Sifat induk: %s\nSifat anak: %s\n\n",myAnak.sifatInduk,myAnak.sifatAnak);
	}

	// @Override
	protected void gantiSifatInduk(String sender){
		//Inherit from superclass
		super.gantiSifatInduk(sender);
		
		System.out.println("terganti!");
	}

	public static void main(String[] args) {
		String sifatInduk = "Pemarah";
		String sifatAnak = "Ramah";

		myAnak.setSifatAnak(sifatAnak);

		System.out.format("Sifat induk: %s\nSifat anak: %s\n\n",myAnak.sifatInduk,myAnak.sifatAnak);

		myAnak.gantiSifatAnakDanInduk("Baik", "Ramah");

		myAnak.gantiSifatInduk("Manis");
		System.out.format("Sifat induk: %s\nSifat anak: %s\n\n",myAnak.sifatInduk,myAnak.sifatAnak);

	}
}