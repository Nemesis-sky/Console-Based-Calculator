package Calculator;

import inputs.*;
import java.io.IOException;
import java.util.Scanner;
import operations.*;

public class Calculator {
	public static void main(String[] args) throws IOException  {

		
		while (true) {
			
			System.out.println("Welcome to the Scientific Calulator");
			System.out.println("Below are the list of operations ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. PowerOf");
			System.out.println("6. SquareRoot");
			System.out.println("7. nthRoot");
			System.out.println("8. Logarithmic value");
			System.out.println("9. Natural Log");
			System.out.println("10. Sine");
			System.out.println("11. Inverse Sine");
			System.out.println("12. Cosine");
			System.out.println("13. Inverse Cosine");
			System.out.println("14. Tangent");
			System.out.println("15. Inverse Tangent");
			System.out.println("16. Stor");
			System.out.println("17. recall");
			System.out.println("18. d2b (Decimal to Binary)");
			System.out.println("19. b2d (Binary to Decimal)");
			System.out.println("20. SIP");
			System.out.println("0. Exit");
			System.out.println("Please enter the operation you wish to perform  : ");
			
			BasicCal bc = new BasicCal();
			SciCal sciCal = new SciCal();
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			Storage st = new Storage();
			d2bandb2d binary = new d2bandb2d();
			Slipcal slip = new Slipcal();
			nthRoot nr = new nthRoot();

			switch (Choice) {
			case 1: {
				int[] var = MultiInput.takeInput();
				System.out.println("Your Addition is " + bc.addition(var[0], var[1]));
				break;
			}

			case 2: {
				int[] var = MultiInput.takeInput();
				System.out.println("Your subtraction is " + bc.subtraction(var[0], var[1]));
				break;
			}
			case 3: {
				int[] var = MultiInput.takeInput();
				System.out.println("Your multiplication is " + bc.multiplication(var[0], var[1]));
				break;
			}

			case 4: {
				int[] var = MultiInput.takeInput();
				System.out.println("Your division is " + bc.division(var[0], var[1]));
				break;
			}
			case 5: {
				int[] var = MultiInput.takeInput();
				System.out.println("Your ans is " + bc.powerOf(var[0], var[1]));
				break;
			}
			case 6: {
				int var = singleInput.takeInput();
				System.out.println("Square root is " + sciCal.squareRoot(var));
				break;
			}

			case 7:
				nr.nth_Root();
				break;

			case 8: {
				double var = singleInput.takeInput();
				System.out.println("The log of givern number is " + sciCal.log(var));
				break;
			}

			case 9: {
				double var = singleInput.takeInput();
				System.out.println("The natural log of givern number is " + sciCal.logn(var));
				break;
			}

			case 10: {
				double var = singleInput.takeInput();
				System.out.println("The sin of given number is " + sciCal.sine(var));
				break;
			}

			case 11: {
				double var = singleInput.takeInput();
				System.out.println("The siinverseSine of given number is " + sciCal.inverseSine(var));
				break;

			}
			case 12: {
				double var = singleInput.takeInput();
				System.out.println("The cosin of given number is " + sciCal.cosin(var));
				break;
			}

			case 13: {
				double var = singleInput.takeInput();
				System.out.println("The inverseCosin of given number is " + sciCal.inverseCosin(var));
				break;
			}

			case 14: {
				double var = singleInput.takeInput();
				System.out.println("The tangent of given number is " + sciCal.tangent(var));
				break;
			}

			case 15: {
				double var = singleInput.takeInput();
				System.out.println("The inverseTangent of given number is " + sciCal.inverseTangent(var));
				break;
			}

			case 16:
				st.storeNumber();
				break;

			case 17:
				st.recall();
				break;

			case 18:
				binary.d2b();
				break;

			case 19:
				binary.b2d();
				break;

			case 20:
				slip.calculateSIP();
				break;

			default:
				System.out.println("Invalid choice");

			}
		}
	}
}
