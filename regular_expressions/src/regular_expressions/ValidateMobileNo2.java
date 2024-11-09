package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo2 {
	public static void main(String[] args) {
		String str = "This is Vishnu. My Contact No. 9988776655 and 8877665544";
		
		String regex = "[6-9][0-9]{9}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		/*if(m.find()) {
			System.out.println("found");
			System.out.println(m.group());
		}else {
			System.out.println("not found");
		}*/
		while(m.find()) {
		System.out.println(m.group());
		}
	}
}
