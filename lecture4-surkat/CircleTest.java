
import static javax.swing.JOptionPane.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CircleTest{
	public static void main(String[] args) throws NumberFormatException, IOException{
	  int choice;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  do {
		System.out.println("Skriv inn radius i sirkelen: ");
		double radiusNumber = Double.parseDouble(br.readLine());

		  /* Lager objekt av typen Circle */
          Circle myCircle = new Circle(radiusNumber);

		  double area = myCircle.calculateArea();
		  double circumference = myCircle.calculateCircumference();

		  System.out.println(myCircle);
		  System.out.println(myCircle + " som gir areal = " + (int)area + " og omkrets " + (int)circumference);

		  System.out.println("Ønsker du å fortsette programmet? type: no/yes");
		  choice =Integer.parseInt(br.readLine()); 
        } while (choice == 1);
    }
}


