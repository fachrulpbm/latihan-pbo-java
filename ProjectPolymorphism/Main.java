public class Main{
	public static void main(String[] args) {

		/* Polymorphism */
		Person p = new Mahasiswa();

		/* Type casting */
		((Mahasiswa)p).setNim("123");

		p.showPerson();
	}
}