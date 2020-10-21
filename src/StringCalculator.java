public class StringCalculator {

    public int add(String input){
        if(isEmpty(input))
            return 0;
        else if(length(input)==1)
            return string2Int(input);

        String[] strings = input.split(",");

        return getSum(strings[0],strings[1]);
    }

    //get sum of two numbers
    private int getSum(String n1,String n2){
        return Integer.parseInt(n1)+Integer.parseInt(n2);
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
