import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private final String delimiters=",|\n";

    public int add(String input){
        if(isEmpty(input))
            return 0;
        else if(length(input)==1)
            return string2Int(input);

        String[] strings = split(input);

        return getSum(strings);
    }

    public String[] split(String input){
        if(input.startsWith("//")){
            return splitOnCustomDelimiters(input);
        }
        return input.split(delimiters);
    }

    private String[] splitOnCustomDelimiters(String input){
        String regex = "//(.)\n(.*)";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        matcher.matches();
        String customDelimiters = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(customDelimiters);
    }

    //get sum of two numbers
    private int getSum(String[] strings){
        int sum=0;
        for(String n:strings){
            sum += string2Int(n);
        }
        return sum;
    }

    //find the length of string
    private int length(String input){
        return input.length();
    }

    //convert string to integer
    private int string2Int(String input){
        return Integer.parseInt(input);
    }

    //check whether string is empty
    private boolean isEmpty(String input){
        return input.isEmpty();
    }

}
