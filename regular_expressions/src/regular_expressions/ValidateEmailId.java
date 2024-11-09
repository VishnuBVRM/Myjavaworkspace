package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 1. Only allowed characters a-z, 0-9, . , _
 2. Should begins with alphabet
 3. must contain @ character
 4. ends with .com, .in, .org, .edu
 */

public class ValidateEmailId {
	public static void main(String[] args) {
		String str = "abc@gamil.com";
		
		String regex = "[a-z][a-z0-9._]*@[a-z0-9]+[.][a-z]{2,3}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)){
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
	}
}
