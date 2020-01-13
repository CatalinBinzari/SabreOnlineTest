import java.util.Scanner;
import java.util.*; 
public class Test {
	public static void main(String args[]) {
	System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        inputString = inputString.replaceAll("\\p{Punct}", "").toLowerCase();
        
        Set<String> letters = new HashSet<String>(Arrays.asList(inputString.split("(?!^)")));
        Set<String> words = new TreeSet<String>(Arrays.asList(inputString.split(" ")));
        
        letters.remove(" ");
        
        for (String letter : letters) {
        	 System.out.print(letter+ ": ");
        	 String out = "";
        	  for (String word : words) {
        		  if(word.indexOf(letter.charAt(0))!=-1) {
        		  	  out += word;
        			  System.out.print(out);
        			  out = ", ";
        			  
        		  }
        	  }
        	  System.out.print("\n");
        	}	
	}
}
