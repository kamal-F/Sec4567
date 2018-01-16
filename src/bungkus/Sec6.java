package bungkus;

public class Sec6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		// x = 3 / 0;
		try {
			x = 3 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sesuatu dibagi nol");
		}
	}

}
