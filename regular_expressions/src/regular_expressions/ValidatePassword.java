package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
	public static void main(String[] args) {
		String str = "Vishnu@371*";
		
		String regex1 = "[A-Z][a-z][0-9][!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\/,.<>\\/?]";
		
		Pattern p = Pattern.compile(regex1);
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)){
			System.out.println("valid Password");
		}else {
			System.out.println("Invalid Password");
		}	
	}
}
