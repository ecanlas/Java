public class Array{

	public static void main(String [] args){
	
	// Instantiate an array and call it midThree with parameters of 4 to 10
	int[] midThree = new int[] {4,5,6,7,8,9,10};
	// Java does not do decimals so when you divide something into two it will just discard the remainder we use the % sign to grab the remainder
	
	// so the starting point will be the middle -1 whatever happens 21/2 = 10 so the start point is 10-1 = 9
	// The end point will be the same thing. middle point is 21/2 = 10 so the end point is 10+2 = 11
	//lastly increment the start point by one until it reaches the end
	for(int j=midThree.length/2-1; j<midThree.length/2+2; j++)
	{
	
	//print the answer
		System.out.println(midThree[j]);
		}
	}
}