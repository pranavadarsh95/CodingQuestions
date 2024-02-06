package CommonCodes;

import java.util.Arrays;

// GFG Link:- https://www.geeksforgeeks.org/multiply-large-numbers-represented-as-strings/

public class TwoNumberMultiplicationUsingString {
    public static void main(String[] args) {
        String num1 = "654154154151454545415415454";
        String num2 = "63516561563156316545145146514654";

        System.out.println(myMultiply(num1,num2));
    }

    private static String myMultiply(String num1, String num2) {
        int n1[] = new int[num1.length()];
        int n2[] = new int[num2.length()];

        int result[] = new int[num1.length()+num2.length()];

        for(int i=0; i < n1.length; i++){
            n1[i] = num1.charAt(num1.length()-i-1)-'0';
        }

        for(int i=0; i < n2.length; i++){
            n2[i] = num2.charAt(num2.length()-i-1)-'0';
        }

        for(int i = 0; i < n1.length; i++){
            int carry = 0;
            for(int j = 0; j < n2.length; j++){
                int product = n1[i] * n2[j]+ carry + result[i+j];
                carry = product/10;
                result[i+j] = product % 10 ;
            }
            result[i+ n2.length] = carry;
        }

        StringBuilder sb = new StringBuilder();
        int i = result.length-1;
        while(result[i]==0){
            --i;
        }

        while(i>=0){
            sb = sb.append(result[i]);
            --i;
        }

        return sb.toString();
    }
}
