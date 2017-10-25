package hipster.controller;

public class HipsterController
{
	private int[] numbers;
	private String[] words;
	
	public void start()
	{
		fillArrays();
	}
	
	private void fillArrays()
	{
		numbers = new int[7];
		numbers[0] = 2;
		numbers[1] = 3;
		numbers[2] = 5;
		numbers[3] = 7;
		numbers[4] = 11;
		numbers[5] = 13;
		numbers[6] = 17; 
		
//		for (int index = 0; index < numbers.length; index +=1)
//		{
//			numbers[index] = index + 1;
//		}
// 		You can use a for loop to fill these, but you can't do things like prime numbers with that
		
		for (int index = 0; index < numbers.length; index +=1)
		{
			System.out.println("The number at index " + index + " is " + numbers[index]);
		}
		
		words = new String[7];
		words[0] = "Testing1";
		words[1] = "Testing2";
		words[2] = "Testing3";
		words[3] = "Testing4";
		words[4] = "Testing5";
		words[5] = "Testing6";
		words[6] = "Testing7";
		
		for(int index = 0; index < words.length; index +=1)
		{
			System.out.println("The string at index " + index + " is " + words[index]);
		}
	}
}
