import static javax.swing.JOptionPane.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CakeTest{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingrediens 1: ");
		String ingr1 = br.readLine();
		System.out.print("Ingrediens 2: ");
		String ingr2 = br.readLine();
		System.out.print("Kakens str (diameter) ");
		int size = Integer.parseInt(br.readLine());
		System.out.print("Navn: ");
		String name = br.readLine();
		System.out.print("Smak (nydelig, ok, ille): ");
		String flavour = br.readLine();

		/* Lager objekt av typen Kake */
        Cake myCake = new Cake( ingr1, ingr2, size, name, flavour);

		int numberOfPieces = myCake.getNumberOfPieces();

		System.out.println(myCake + "\nAntall kakestykker: "+ numberOfPieces);

	}
}

/* Eksempel paa kjoering:

Lukket valnoett
Ingredienser: Egg, Marsipan
Stoerrelse: 28cm
Kaken smaker nydelig
Antall kakestykker: 20

*/