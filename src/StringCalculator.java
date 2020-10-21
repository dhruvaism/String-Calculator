import org.junit.platform.commons.util.StringUtils;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringCalculator {

    private final String delimiters=",|\n";

    public int add(String input) throws Exception {
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

    private String[] splitOnCustomDelimiters(String input) throws PatternSyntaxException {
        String regex = "//(.)\n(.*)";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        matcher.matches();
        String customDelimiters = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(customDelimiters);
    }

    //get sum of two numbers
    private int getSum(String[] strings) throws Exception {

        checkForNegativeNumbers(strings);

        int sum=0;
        for(String n:strings){
            sum += string2Int(n);
        }
        return sum;
    }

    private void checkForNegativeNumbers(String[] strings) throws Exception{
        ArrayList<Integer> negatives = new ArrayList<>();
        for(String n:strings){
            if(string2Int(n)<0)
                negatives.add(string2Int(n));
        }
        if(negatives.size()>0){
            String neg="";
            for(int n:negatives) {
                neg += n + ", ";
            }
            throw new Exception("negatives not allowed : "+neg);
        }
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
