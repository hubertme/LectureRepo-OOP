public class Induk{
	String sifatInduk;

	// Error if private
	protected void setSifatInduk(String sender){
		this.sifatInduk = sender;
	}

	protected void gantiSifatInduk(String sifatBaru){
		this.sifatInduk = sifatBaru;
	}
}