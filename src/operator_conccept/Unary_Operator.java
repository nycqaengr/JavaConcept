package operator_conccept;

/*   	Unary Operator 			Meaning
 * 			+					Unary Plus
 * 			-					Unary Minus
 * 			++					Increment
 * 			--					Decrement
 *
 */

public class Unary_Operator {

    public static void main(String[] args) {

        int x = 10;
        //int x = -10;
        int result;

        result = +x;
        System.out.println("result is :"+result);

        result = -x;
        System.out.println("result is :"+result);
    }
}
