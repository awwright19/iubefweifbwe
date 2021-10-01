package itec220.labs;

public class Main {

	public static void main(String[] args) {
		int num = 1;
		int factNum = 4;
		int factNum2 = 3;
		int factNum3 = 2;
		num = factorial(factNum);
		num = factorial(factNum2);
		num = factorial(factNum3);
		System.out.println("Factorial of " + factNum + " is " + num);
		System.out.println("Factorial of " + factNum2 + " is " + num);
		System.out.println("Factorial of " + factNum3 + " is " + num);
		
		int gcd = 0;
		int gNum = 36;
		int gNum2 = 60;
		gcd = gcd(gNum,gNum2);
		System.out.println("\nGreatest Common Denominator of " + gNum + " and " + gNum2 + " is " + gcd);

	} // Main

	static int factorial(int f) {
		if (f == 0) {
			return 1;
		} else {
			return (f * factorial(f - 1));
		}
	}

	static int gcd(int num, int num2) {
		if (num == 0) {
			return num2;
		}
		if (num2 == 0) {
			return num;
		}
		if (num==num2) {
			return num;
		}
		if (num > num2) {
			return gcd(num-num2,num2);
		}

		return gcd(num, num2-num);
	}
} // Main Class
