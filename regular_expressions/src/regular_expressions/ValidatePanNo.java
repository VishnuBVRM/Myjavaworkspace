package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePanNo {
	public static void main(String[] args) {
		String str = "ANGPA6354G";
		
		String regex = "[A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z]";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)){
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
	}
}
