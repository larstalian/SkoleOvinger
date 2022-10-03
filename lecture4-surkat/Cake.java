/* Cake.java  BK 30.08.2020*/
class Cake {
  /*********************************/
  /* Attributter - Objektvariabler */
  /*********************************/
	private String ingredience1;
	private String ingredience2;
	private int size;
	private String name;
	private String flavour;

  /* Konstruktoer */
  public Cake(String ingredience1, String ingredience2, int size, String name, String flavour){
	 this.ingredience1 = ingredience1;
	 this.ingredience2 = ingredience2;
	 this.size = size;
	 this.name = name;
	 this.flavour = flavour;
  }

  /*********************************/
  /* Operasjoner - Metoder:*/
  /*********************************/

  /* Tilgangsmetoder */
  public String getIngredience1(){
	  return ingredience1;
  }

  public String getIngredience2(){
  	  return ingredience2;
  }

  public int getSize(){
	  return size;
  }

  public String getName(){
	  return name;
  }

  public String getflavour(){
	  return flavour;
  }

  /* Objektmetoder */
   public int getNumberOfPieces(){
	   int numberOfPieces;
	   if (size > 40) {
		   return 30;
	   } else if (size >= 30){
		   return 25;
	   } else if (size >= 20){
		   return 15;
	   } else {
		   return 1;
	   }
   }

   public String toString(){
	   String res = name + "\n";
	   res += "Ingredienser: " + ingredience1 + ", " + ingredience2;
	   res += "\nStoerrelse: " + size + "cm";
	   res += "\nKaken smaker " + flavour;
	   return res;
   }
}