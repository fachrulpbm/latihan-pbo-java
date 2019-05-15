public abstract class Hewan{

	private double massa;
	private String warna;

	public abstract void bersuara();

	public Hewan(double a, String b){
		massa = a;
		warna = b;
	}

	public double getMassa(){
		return massa;
	}

	public String getWarna(){
		return warna;
	}

}