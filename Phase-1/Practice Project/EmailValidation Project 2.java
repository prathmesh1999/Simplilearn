import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
		   public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
      
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("prathmesh@example.com");
		       emails.add("nilesh@example.com");
		       emails.add("shishir@example.me.org");
		       //invalid email addresses
		       emails.add("vivek.example.com");
		       emails.add("harshal..bob@example.com");
		       emails.add("r@.example.com");

		       for (String value : emails) {
		           System.out.println("Email id are: "+value);
		       }
		       System.out.println();
		       System.out.print("Enter email address to search: ");
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       System.out.println();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}