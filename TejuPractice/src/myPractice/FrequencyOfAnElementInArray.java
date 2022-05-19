package myPractice;

public class FrequencyOfAnElementInArray {
	public static void main(String args[]) {
	int arr[]=new int[] {1,3,3,3,6,6,7};
	int visitedArr[]=new int[arr.length];
	int visited=-1 ;
	for(int i=0;i<arr.length;i++)
	{
		int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				visitedArr[j]=visited; 
			}
		}
		if(visitedArr[i]==visited)
		{
			visitedArr[i]=count;
		}
	}
	for(int k=0;k<visitedArr.length;k++)
	{
		if(visitedArr[k]!=visited)
		{
			System.out.println("frequency of"+arr[k]+" "+visitedArr[k]);
		}
	}
	} 
}


