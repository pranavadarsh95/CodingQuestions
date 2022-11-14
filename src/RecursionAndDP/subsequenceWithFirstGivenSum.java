package RecursionAndDP;

public class subsequenceWithFirstGivenSum {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,1};
        int target = 1;
        int sum = 0;
        int i = 0, n = a.length;

        if(subsequenceFound(a, target, sum, i, n))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    private static boolean subsequenceFound(int[] a, int target, int sum, int i, int n) {
        if(i>=n){
            if(sum == target){
                return true;
            }
            return false;
        }
        sum += a[i];
        if(subsequenceFound(a,target,sum,i+1,n)) return true;

        sum -= a[i];
        if(subsequenceFound(a,target,sum,i+1,n)) return true;
        return false;
    }
}

