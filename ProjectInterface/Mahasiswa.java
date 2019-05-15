public class Mahasiswa implements Person{

	private String nama;

	@Override
	public void addPerson(String nama){
		this.nama = nama;
		System.out.println(nama+" was added!");
	}

	public String getNama(){
		return "This is "+nama;
	}


}