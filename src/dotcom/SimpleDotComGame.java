package dotcom;

public class SimpleDotComGame {

	public static void main(String[] args) {
		
		//	Instantiate a SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();
		
		//	Array for the location of the dot com
		int[] arrLocations = { 2, 3, 4 };
		
		//	Set the new locations for the dot com
		dot.SetLocationCells(arrLocations);
		
		//	Make a fake user guess
		String szUserGuess = "2";
		
		//	Invoke the check method and pass it the fake guess
		String szResult = dot.CheckYourself(szUserGuess);

	}

}
