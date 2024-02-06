package CommonCodes;

import java.util.*;
import java.util.stream.Collectors;

public class SortRomanToDigit {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("ram XIV","Shayam XV","Ram XL","Pradeep III","Pradeep IV"));
        System.out.println(list);
        list = sortBasedOnRomanString(list);
        System.out.println();
        System.out.println("After Sorting");
        System.out.println(list);
    }

    private static List<String> sortBasedOnRomanString(List<String> list) {
        PairRN pairArr[] = new PairRN[list.size()];

        for(int i=0;i<list.size();i++){
            String sepratedString = list.get(i).split(" ")[0];
            String sepratedRoman = list.get(i).split(" ")[1];

            pairArr[i] = new PairRN(sepratedString+" "+romanToDecimal(sepratedRoman),list.get(i));
        }
//        System.out.println("Before Sorting");
//        Arrays.stream(pairArr).forEach(a-> System.out.println(a.numericString+" "+a.romanString));

        Arrays.sort(pairArr, new Comparator<PairRN>() {
            @Override
            public int compare(PairRN o1, PairRN o2) {
                String firstString = o1.numericString.split(" ")[0];
                int firstValue = Integer.parseInt(o1.numericString.split(" ")[1]);

                String secondString = o2.numericString.split(" ")[0];
                int secondValue = Integer.parseInt(o2.numericString.split(" ")[1]);

                if(firstString.compareToIgnoreCase(secondString)==0){
                    if(firstValue < secondValue)  return -1;
                    else if(firstValue > secondValue) return 1;
                    else return 0;
                }
                else {
                    return firstString.compareToIgnoreCase(secondString);
                }
            }
        });
        /*System.out.println();
        System.out.println("After Sorting");

        Arrays.stream(pairArr).forEach(a-> System.out.println(a.numericString+" "+a.romanString));
*/
//        String str[] = (String[]) Arrays.stream(pairArr).map(a->a.romanString).toArray();
        return Arrays.stream(pairArr).map(a->a.romanString).collect(Collectors.toList());
    }

    static int value(char r){
        if(r=='I'){
            return 1;
        }if(r=='V'){
            return 5;
        }if(r=='X'){
            return 10;
        }if(r=='L'){
            return 50;
        }if(r=='C'){
            return 100;
        }if(r=='D'){
            return 500;
        }if(r=='M'){
            return 1000;
        }
        return -1;
    }

    static int romanToDecimal(String str){
        int res =0;
        for(int i=0;i<str.length();i++){
            int s1 = value(str.charAt(i));

            if(i+1 < str.length()){
                int s2 = value(str.charAt(i+1));
                if(s1 >= s2){
                    res = res+s1;
                } else{
                    res =res+s2-s1;
                    ++i;
                }
            }
            else{
                res =res+s1;
            }
        }
        return res;
    }
}

class PairRN{
    String numericString;
    String romanString;

    public PairRN(String numericString, String romanString) {
        this.numericString = numericString;
        this.romanString = romanString;
    }

    public String getNumericString() {
        return numericString;
    }

    public void setNumericString(String numericString) {
        this.numericString = numericString;
    }

    public String getRomanString() {
        return romanString;
    }

    public void setRomanString(String romanString) {
        this.romanString = romanString;
    }
}
