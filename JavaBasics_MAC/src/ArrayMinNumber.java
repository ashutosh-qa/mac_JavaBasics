
public class ArrayMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]= {
				{4,2,3}, {5,1,8}, {6,3,1}
				};
		int min=abc[0][0];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				min=abc[i][j];
			}
		}
		System.out.println(min);
		
}
}
