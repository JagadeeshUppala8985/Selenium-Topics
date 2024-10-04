import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

	public static void main(String[] args) {
		
		String str = "Rs400";
		Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println("Found a number: " + matcher.group());
            str.getClass().getSimpleName();
        }

	}

}
