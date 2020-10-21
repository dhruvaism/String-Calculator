public class StringCalculator {

    public int add(String input){
        if(isEmpty(input))
            return 0;
        else if(length(input)==1)
            return string2Int(input);

        String[] strings = input.split(",");

        return getSum(strings);
    }

    //get sum of two numbers
    private int getSum(String[] strings){
        int sum=0;
        for(int i=0;i<strings.length;i++){
            sum += Integer.parseInt(strings[i]);
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
