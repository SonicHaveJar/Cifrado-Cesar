
import java.util.Scanner;

public class Deenciptation {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		String minus = "abcdefghijklmnopqrstuvwxyz ";
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

		String result = "";

		String pwd;
		int CDD;

		System.out.print("Introduce la frase a descifrar: ");
		pwd = S.nextLine();
		System.out.print("Introduce la clave de cifrado: ");
		CDD = S.nextInt();

		for (int i = 0; i < pwd.length(); i++) {
			for (int j = 0; j < minus.length(); j++) {
				if (pwd.charAt(i) == minus.charAt(j)) {
					if (j + CDD >= minus.length()) {
						result += minus.charAt((j - CDD) % minus.length());
					} else {
						result += minus.charAt(j - CDD);
					}

				} else if (pwd.charAt(i) == mayus.charAt(j)) {
					if (j + CDD >= mayus.length()) {
						result += mayus.charAt((j - CDD) % mayus.length());
					} else {
						result += mayus.charAt(j - CDD);
					}
				}
			}
		}
		System.out.println("");
		System.out.println("===================================");
		System.out.println("Frase encriptada: " + pwd);
		System.out.println("Frase desencriptada: " + result);
		System.out.println("===================================");

	}

}
