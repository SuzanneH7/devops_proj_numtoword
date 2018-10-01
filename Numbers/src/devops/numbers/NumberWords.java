package devops.numbers;

public class NumberWords {

	public static final String[] unitsPlace={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT",
			"NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
	public static final String[] tensPlace={"","","TWENTY","THIRTY","FORTY","FIFTY",
			"SIXTY","SEVENTY","EIGHTY","NINETY"};
	public String toWords( int number ) {
		String result =convertNumber(number) ;
		return result.trim() ;
	}

	public String convertNumber(final int number) {
		// TODO Auto-generated method stub
		if (number < 20)
		  {
		     return unitsPlace[number];
		  }
		  
		  if (number < 100)
		  {
		   return tensPlace[number / 10] + ((number % 10 != 0) ? " " : "") + unitsPlace[number % 10];
		  }
		  
		  return unitsPlace[number / 100] + " HUNDRED" + ((number % 100 != 0) ? " " : "") + convertNumber(number % 100);
	}

}
