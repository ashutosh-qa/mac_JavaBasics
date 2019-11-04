
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//define int array
		int [] numbers= {2,3,4,5}; 
		for (int i = 0;i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		//define string array
		String [] fruits= {"Mango","Apple","Payaya","Kiwi"};
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		//multi dimensional array
		int [][] grid= 
			{
				{1,2,3},
				{4,5},
				{6,7,8,9}
			};
		
		for (int row=0; row<grid.length; row++) {
			for (int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");	
			}
			System.out.println();
		}
	
		
		
	}
}
		
	


