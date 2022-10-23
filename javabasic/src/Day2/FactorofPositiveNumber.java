package Day2;

public class FactorofPositiveNumber {
	public static void main(String[] args) {
		
		/**
		 * 
		 * num=15
		 * 
		 * loop-->i=1 to i<= num num%i==0 println(i)
		 */
		//System.out.println(Math.abs(-70));
		factor(-10);
		printFactorOfPositiveNumber(5);
		printFactorOfNegativeNumber(-15);
		//printFactorOfNegativeNumber(-60);
	}

	static void factor(int num) {
		if (num > 0) {//num=5
			for (int i = 0; i <= num; ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i+ ", " );
					}
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println();
	}
	
	static void printFactorOfPositiveNumber(int num) {
		for (int i = 0; i <= num; ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
			

		}
		System.out.println();
	}
	static void printFactorOfNegativeNumber(int num) {
		for (int i = num; i <= Math.abs(num); ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}
}


