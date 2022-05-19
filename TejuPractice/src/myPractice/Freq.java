package myPractice;

 
	class freq
	{
	    // Function to calculate the frequency of all elements in the array
	    // in linear time and without extra space
	    public static void findFrequency(int[] A)
	    {
	        int n = A.length;
	 
	        // For each element `A[i]`, increment the value present at index
	        // `(A[i] % n)` by `n`
	        for (int i = 0; i < n; i++) {
	            A[A[i] % n] += n;
	        }
	  
	        // Traverse the modified array and print their frequencies.
	        // If `A[i] > n`, then `i` appears in array `A[i]/n` times.
	        for (int i = 0; i < n; i++)
	        {
	            if (A[i] / n != 0) {
	                System.out.printf("Element %d appears %d times\n", i, A[i] / n);
	            }
	        }
	  
	        // Restore the array
	        for (int i = 0; i < n; i++) {
	            A[i] = A[i] % n;
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] A = { 2, 3, 3, 2, 1 };
	        findFrequency(A);
	    }
	}

	
