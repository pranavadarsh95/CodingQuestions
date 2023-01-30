package StriverRecursion;

public class SubsequenceWithGivenSumAndReturnCount {
    public static void main(String[] args) {
        int a[] = {2,3,2,5,1,4};
        int sum = 5;
        int arraySize = a.length;

        int result =  printSubSequenceWithSum(0,sum,0,a,arraySize);

            System.out.println("Total Found Subsequences are as "+ result);
    }

    private static int printSubSequenceWithSum(int i, int sum,int mySum, int[] a, int arraySize) {
        if(i>=arraySize || mySum>sum){
            if(mySum==sum){
                return 1;
            }
            return 0;
        }

        mySum = mySum+a[i];
        int lf = printSubSequenceWithSum(i+1,sum,mySum, a, arraySize);


        mySum = mySum-a[i];

        int rt = printSubSequenceWithSum(i+1,sum,mySum, a, arraySize);

        return lf+rt;
    }
}
