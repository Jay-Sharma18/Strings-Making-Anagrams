package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class StringsMakingAnagrams {

	    // Complete the makeAnagram function below.
	    static int makeAnagram(String a, String b) {
	        //remove spaces from strings and covert them to StringBuilders
	        StringBuilder sb1=new StringBuilder(a.replace(" ",""));
	        StringBuilder sb2=new StringBuilder(b.replace(" ",""));
	        //for every character in 1st string, check if it exists in 2nd string; If yes,
	        //delete the character from both and repeat the process. Also, when character is
	        //deleted, adjust loop counter to accomodte the delete by subtracting 1 from it 
	        for(int i=0;i<sb1.length();i++)
	        {
	            for(int j=0;j<sb2.length();j++)
	            {
	                if(sb1.charAt(i)==sb2.charAt(j))
	                {
	                    sb1.deleteCharAt(i);
	                    sb2.deleteCharAt(j);
	                    i--;
	                    
	                    break;
	                }
	            }
	        }
	        //remaining characters in both strings are to deleted
	        return sb1.length()+sb2.length();
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium,Drivers and Cucumber\\test.txt"));

	        String a = scanner.nextLine();

	        String b = scanner.nextLine();

	        int res = makeAnagram(a, b);

	        bufferedWriter.write(String.valueOf(res));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}



