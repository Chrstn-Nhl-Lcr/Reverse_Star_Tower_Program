
package reverse_Star_Tower;
import java.util.Scanner;
public class Reverse_Star_Tower {
		public static void main(String[] args) {
			System.out.println("Please put a number:") ;
			int rows = new Scanner(System.in).nextInt();
			int n = rows;
				
			if(n>21) {
				System.exit(n);
			}
			while (n>0) {
				int j = 0;
				while(j<n) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				n--;
			}
		}
	}