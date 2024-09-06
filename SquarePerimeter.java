//Perimeter of Square 
package Numbers;

import java.util.Scanner;

public class SquarePerimeter {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter length:");
        int length=obj.nextInt();
        System.out.print("Perimeter of square is "+(length*4));
	}

}
