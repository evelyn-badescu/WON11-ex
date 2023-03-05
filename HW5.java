import java.util.Scanner;
import java.util.Random;

public class HW5 {
	public static void main(String[] args) {
		int[] nums={1,2,3,4,5};
		int numar =3;
		System.out.println(sumOfNumbers(nums));
		System.out.println(evenNumbers(nums));
		numbersGreaterThan(nums,numar);
		System.out.println();

		int nr=34000;
		System.out.println(strangereDonatii(nr));

		int max=20;
		System.out.println(strangereDonatii2(nr,max));
		


	}


	public static int sumOfNumbers(int [] numere) {
		int sum=0;
		for(int i=0;i<numere.length;i++) {
			sum += numere[i];
		}
		return sum;

	}

	public static int evenNumbers(int [] altenumere) {
		int count=0;
		for(int x=0;x<altenumere.length;x++) {
			if(altenumere[x]%2==0) {
				count++;
			}
		}
		return count;
	}

	public static void numbersGreaterThan(int [] numbers ,int nr) {
		for(int j : numbers ) {
			if(j>nr) {
				System.out.print(j+" ");
			}
		}
	}

	public static String strangereDonatii2(int targetDonatii) {
		Random random=new Random();
		int donatii=random.nextInt(targetDonatii);
		int sum=0;

		do {
			sum+=donatii;

			if(sum == targetDonatii) {
				break;
			}
		}while(true);
		return "Success";


	public static String strangereDonatii(int targetDonatii,int maximDonatie) {
		Random random=new Random();
		int donatii=random.nextInt(targetDonatii);
		int sum=0;
		int nrdonatie=0;

		do {
			sum+=donatii;
			nrdonatie++;

			if((nrdonatie<maximDonatie) && (sum == targetDonatii)) {
				break;
			}
		
		}while(true);
		return "Incheiat";
	}

	

}