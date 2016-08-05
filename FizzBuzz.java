/**
 * @author malloneec
 * @since 8/5/16
 */
public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1;i<101;i++){
            determineOutput(i);
        }
    }

    private static void determineOutput(int i){
        String out = "";
        if(i%3==0){
            out=out+"Fizz";
        }
        if(i%5==0){
            out=out+"Buzz";
        }
        if(out.equals("")){
            out=Integer.toString(i);
        }
        System.out.println(out);
    }
}
