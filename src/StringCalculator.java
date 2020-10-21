public class StringCalculator {

    public int add(String input){
        if(isEmpty(input))
            return 0;
        else if(input.length()==1)
            return Integer.parseInt(input);
        return -1;
    }

    private boolean isEmpty(String input){
        return input.isEmpty();
    }

}
