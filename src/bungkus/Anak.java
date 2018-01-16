package bungkus;

public class Anak extends Ayah {

	public Anak(String nama) {
		super("@@" + nama + "@@");
		// TODO Auto-generated constructor stub
	}

	public Anak(String nama, String npm) {
		super("@@" + nama + "@@", "@@" + npm + "@@");
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bungkus.Ayah#setNama(java.lang.String)
	 */
	@Override
	public void setNama(String nama) {
		// TODO Auto-generated method stub
		super.setNama("--" + nama + "--");
	}

	public static void baca() {
		System.out.println("tanpa new karena statis");
	}

}
