package myPractice;

public class RowSumnColumnSum {

	public static void main(String[] args) {
		int arr[][]= {{1,7,3},{2,8,4},{3,9,5}};
		for(int i=0;i<arr[0].length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				rowSum+=arr[i][j];
			}
			System.out.print(rowSum+" ");
		}
		System.out.println(" ");
	
	for(int i=0;i<arr[0].length;i++) {
		int columnSum=0;
		for(int j=0;j<arr[0].length;j++)
		{
			columnSum+=arr[j][i];
		}
		System.out.print(columnSum+" ");
	}
	System.out.println(" ");
}

}
