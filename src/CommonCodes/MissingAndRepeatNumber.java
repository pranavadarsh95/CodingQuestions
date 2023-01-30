package CommonCodes;

public class MissingAndRepeatNumber {
    /*
    https://www.interviewbit.com/problems/repeat-and-missing-number-array/

    public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        long missingminusRepeat = 0L;
        long missingSqMinusRepeatSq = 0L;
        long SumOfActual = 0L;
        long SumSqOfActual = 0L;
        int n = A.length;

        for(int i=0;i<n;i++){
           SumOfActual = SumOfActual + A[i];
           SumSqOfActual = SumSqOfActual + A[i] * A[i];
        }
        missingminusRepeat = ((n*(n+1))/2) - SumOfActual;
        missingSqMinusRepeatSq = (n*(n+1)*(2*n+1))/6 - SumSqOfActual;

        long missingPlusRepeat = missingSqMinusRepeatSq / missingminusRepeat;

        long missing = (missingPlusRepeat + missingminusRepeat) / 2;

        long repeat = missingPlusRepeat - missing;

        return new int[]{(int)repeat,(int)missing};

    }
}

     */
}
