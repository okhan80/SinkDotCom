package dotcom;

public class SimpleDotCom {

	private int m_nNumOfHits;
	private int[] m_aLocationCells;

	public String CheckYourself(String szUserGuess) {
		
		//	Convert the String to an int
		//	This will use a built in class and a method to parse a string into
		//	an int
		int nGuess = Integer.parseInt(szUserGuess);
		
		//	Variable that will hold the result we will return.
		//	The default value will be "miss"
		String szResult = "miss";
		
		//	In order to loop through the array, there will have to
		//	be an iterator that holds one element of the array
		//	that needs to be. Using a colon means you are looking
		//	inside something, and finally the actual array that
		//	I wish to iterate through over and over
		for(int nCell : m_aLocationCells)
		{
			//	Check to see if the user guess is equivalent to
			//	the cell
			if(nGuess == nCell)
			{
				//	Successful hit
				szResult = "hit";
				
				//	Increment the number of hits by one
				m_nNumOfHits++;
				
				//	Stop the loop as we have a successful hit
				break;
			}
		}
		
		//	Check to see if we have sunk the dot com
		if(m_nNumOfHits == m_aLocationCells.length)
		{
			szResult = "kill";
		}
		
		//	Display the result to the user
		System.out.println(szResult);
		
		//	Return the result
		return szResult;
		
	}

	public void SetLocationCells(int[] arrLocations) {
		// TODO Auto-generated method stub
		m_aLocationCells = arrLocations;
		
	}

}
