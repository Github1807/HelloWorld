package myPractice;

public class ArrayMergeWithoutusingfunction {

	public static void main(String[] args) {
		int a[]= {1,3,4,2};
		int b[]= {2,4,5,3,2};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int c[]=new int[c1];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];  
		}
		for(int i=0;i<b.length;i++) {
			c[a1+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}


	}

}
