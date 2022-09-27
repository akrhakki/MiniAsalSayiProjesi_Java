package MiniAsalSayiProjesi;

public class main {

	public static void main(String[] args) {
		int number = -6;
		boolean IsPrime = true;
		if (number == 1) {
			System.out.println("Asal Sayi Değildir!!");
			return;
		}
		if (number < 1) {
			System.out.println("Gecersiz Sayi!!");
		} else {

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					IsPrime = false;
				}

			}
			if (IsPrime) {
				System.out.println("Asal Sayidir!");

			}
			if (IsPrime == false) {
				System.out.println("Asal Sayi Değildir!");
			}
		}
	}

}
