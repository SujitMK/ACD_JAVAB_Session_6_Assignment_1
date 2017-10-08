package arrayEvenNumbersPKG;          // Package declared

public class ArrayEvenNumbers {         // class declared 

	public static void main(String[] args) {          // Main method 
		// TODO Auto-generated method stub
		
		int[] array = new int[10];          // declared an array of int type and size 10
		int j = 1;                             // declared and initialized a variable with 1
		
		for (int i=0; i < array.length; i++)     // for loop to initialize array from 1 to 10
		{			
			array[i] = j;                          // Initializing array from 1 to 10
			
			j++;                                   // incrementing by 1	
		}

		System.out.println("Even Array Elements Are : ");     // printing info to user
		
		for(int k=0; k<array.length; k++)      // For loop to print even array elements 
		{
		    if(array[k]%2 == 0)                     // if condition to check even numbers
		    {
		    	System.out.println("Array["+k+"] = "+array[k]);         // printing even array elements
		    }
		}
	}

}
