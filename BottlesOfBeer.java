public class BottlesOfBeer{
  public static void main(String[] args) {
    int numOfBeers = 99;
    String bottle = "bottles";

    while (numOfBeers > 0){
      if (numOfBeers == 1){
        bottle = "bottle";
      }
      System.out.println(numOfBeers + " " + bottle + "of beer");
      System.out.println("if one beer would accidently fall");
      numOfBeers = numOfBeers - 1;
      System.out.println("there would be " + numOfBeers + " " + bottle);
    }

}
}
