public class StringCalculator {

    public int add(String input){
        if(isEmpty(input))
            return 0;

        return -1;
    }

    private boolean isEmpty(String input){
        return input.isEmpty();
    }

}
