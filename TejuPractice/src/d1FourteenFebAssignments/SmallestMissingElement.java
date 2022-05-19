package d1FourteenFebAssignments;

public class SmallestMissingElement {


    public static int missing_element(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int check1[]={0, 1, 2, 6, 9, 11, 15};
        int check2[]={1, 2, 3, 4, 6, 9, 11, 15};
        int check3[]={0, 1, 2, 3, 4, 5, 6};
        System.out.println("the smallest missing number of array 1  "+missing_element(check1));
        System.out.println("the smallest missing number of array 2  "+missing_element(check2));
        System.out.println("the smallest missing number of array 3  "+missing_element(check3));

    }
}


