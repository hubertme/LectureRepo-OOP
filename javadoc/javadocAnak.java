/** Sub-class of Induk*/

// extends -> Inheritance
public class javadocAnak extends javadocInduk{
	String sifatAnak;
	static javadocAnak myAnak = new javadocAnak();

	protected void setSifatAnak(String sender){
		this.sifatAnak = sender;
	}
	
	/** Main function here:
	Change sifatAnak attribute
	*/
	static void gantiSifatAnakDanInduk(String sifatInduk, String sifatAnak){
		myAnak.setSifatAnak(sifatAnak);
		myAnak.setSifatInduk(sifatInduk);

		System.out.format("Sifat induk: %s\nSifat anak: %s\n\n",myAnak.sifatInduk,myAnak.sifatAnak);
	}

	/** Main function here:
	Change sifatInduk inheritted attribute
	*/
	protected void gantiSifatInduk(String sender){
		/** Inherit from superclass*/
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