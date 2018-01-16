package bungkus;

public class Ayah {
	private String nama;
	private String npm;

	public Ayah(String nama) {
		super();
		this.nama = nama;
	}

	// overloading method constructor Ayah
	public Ayah(String nama, String npm) {
		super();
		this.nama = nama;
		this.npm = npm;
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return nama;
	}

	/**
	 * @param nama
	 *            the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

}
