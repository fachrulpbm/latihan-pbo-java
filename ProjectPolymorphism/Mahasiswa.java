public class Mahasiswa extends Person{
	
	private String nim;

	public void setNim(String nim){
		this.nim = nim;
	}

	/* Method Overriding */
	@Override
	public void showPerson(){
		System.out.println("Method overriding");
		System.out.println(getNama() + " "+getAlamat());
	}
}