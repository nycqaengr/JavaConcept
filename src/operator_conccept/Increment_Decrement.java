package operator_conccept;

/*
 *  	==> Increment: prefix increment (++a) and post-fix increment (a++)
 * 		==> Decrement: prefix decrement (--a) and post-fix decrement (a--)
 *
 * 		++x;	increments x by one -BEFORE it is used
 * 		x++; 	increments x by one -AFTER it is used
 *
 * 		--x;	decrements x by one -BEFORE it is used
 * 		x--;	decrements x by one -AFTER it is used
 */

public class Increment_Decrement {

    public static void main(String[] args) {

        int x = 25;
        int y;
        int z;

        y = x++;
        System.out.println("value of y : "+y);

        y = x; // value of x is 26
        System.out.println("value of x :"+y);

        y = ++x; //value of x is 27
        System.out.println("value of y :"+y);

        z = x--;
        System.out.println("value of z is :"+z);

        z = --x;
        System.out.println("value of z is :"+z);

    }
}
