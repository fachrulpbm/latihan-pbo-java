public class Kucing extends Hewan{

	private String nama;
	
	@Override
	public void bersuara(){
		System.out.println("Meong");
	}

	public Kucing(double massa, String warna, String nama){
		super(massa, warna);
		this.nama = nama;
	}


}