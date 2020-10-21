public class StringCalculator {

    public int add(String input){
        if(isEmpty(input))
            return 0;
        else if(length(input)==1)
            return string2Int(input);
        return -1;
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
