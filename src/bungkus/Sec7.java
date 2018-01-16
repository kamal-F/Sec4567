package bungkus;

public class Sec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ayah budi = new Ayah("budi santika");
		Ayah iwan = new Ayah("Iwan Santoso", "1122278");
		
		System.out.println(budi.getNama());
		System.out.println(iwan.getNama());
		iwan.setNama("Iwan Pemuda Idaman");
		System.out.println(iwan.getNama());
		
		Anak wati = new Anak("Wati Wanita Teknik Informatika", "007");
		System.out.println(wati.getNama());
		wati.setNama("Wati Santoso");
		System.out.println(wati.getNama());
		
		Anak.baca();		
	}

}
