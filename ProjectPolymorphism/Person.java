public class Person{
	
	private String nama;
	private String alamat;

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

	public void showPerson(){
		System.out.println(nama + " "+alamat);
	}

	/* Method Overloading */
	public void showPerson(String msg){
		System.out.println(msg+ " "+ nama + " "+alamat);
	}

}