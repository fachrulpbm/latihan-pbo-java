public class Dosen{
	
	private int nidn;
	private String nama;

	public Dosen(int nidn, String nama){
		this.nidn = nidn;
		this.nama = nama;
	}

	public void showDosen(){
		System.out.println(nidn+" "+nama);
	}

	/* Method Overloading */
	/* Nama method sama, tapi parameternya berbeda */
	/* baik dari jumlahnya dan tipe datanya */
	public void showDosen(String pesan){
		System.out.println(nidn+" "+nama);
		System.out.println(pesan);
	}

}