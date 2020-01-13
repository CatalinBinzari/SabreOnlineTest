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
        
        //The next steps can be done with iterators and no comma will be at the end of each row,
        //but it may lose with readability.
        for (String letter : letters) {
        	 System.out.print(letter+ ": ");
        	  for (String word : words) {
        		  if(word.indexOf(letter.charAt(0))!=-1) {
        			  System.out.print(word +", ");
        			  
        		  }
        	  }
        	  System.out.print("\n");
        	}	
	}
}
