
class Circle {
  /*********************************/
  /* Attributter - Objektvariabler */
  /*********************************/
	private double radius;

    /* Konstruktoer */
  public Circle(double radius){
	 this.radius = radius;
  }

  /*********************************/
  /* Operasjoner - Metoder:*/
  /*********************************/

  /* Tilgangsmetoder */
  public double getRadius(){
	  return radius;
  }

  /* Objektmetoder */
  public double calculateArea(){
  	  return Math.PI*radius*radius;
  }

  public double calculateCircumference(){
    return 2*Math.PI*radius;
  }

   public String toString(){
	   String res = "Radius i sirkelen er " + radius;
	   return res;
   }
}



