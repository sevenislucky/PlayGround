public class SimpleDotComTestDrive{
  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom(); //initiate a SimpleDotCom object

    int[] locations = {2,3,4}; //making an array for the SimpleDotCom

    dot.setLocationCells(locations); //invoke the setter method in SimpleDotCom

    String userGuess = "3"; // making a fake guess

    String result = dot.checkYourself(userGuess); //now invoke using the checkYourself method from
                                                  // SimpleDotCom

    String testResult = "failed"; // initiate test result to false

    if (result.equals("hit")){ // userguess is equals to 
      testResult = "passed";
    }
    System.out.println(testResult);
  }
}
