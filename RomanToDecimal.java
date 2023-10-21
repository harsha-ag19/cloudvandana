/*package whatever //do not write package name here */

import java.io.*;

class RomanToDecimal {
    // Finds decimal value of a given roman numeral
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Its Decimal equivalent is " + romanToDecimal(s));
    }
    public static int romanToDecimal(String str) {
        int arr[] = new int[]{1, 5, 10, 50, 100, 500, 1000};
        int n = str.length();
        
        int prev = 0;
        int num = 0;
        int i=n-1;
        while(i>=0)
        {
            
            char ch= str.charAt(i);
            int equi = arr[getIdx(ch)];
            
            if(prev > equi){
                num -= equi;
            } else {
                num += equi;
            }
            
            prev = equi;
            i--;
        }
        return num;
    }
    public static int getIdx(char ch)
    {
        switch(ch){
            case 'I': return 0;
            case 'V': return 1;
            case 'X': return 2;
            case 'L': return 3;
            case 'C': return 4;
            case 'D': return 5;
            case 'M': return 6;
        }
        return 0;
    }
}