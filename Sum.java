// Name: Smita Dutta
public class Sum {
//1. Write a program to find the sum of even numbers between 25 to 51.
public static void main(String[] args) {
	int sum =0;
	for(int i = 25; i<=51; i++) {
		if(i%2==0) {
			sum = sum+i;
		}
		
	}
	System.out.println("sum of ever number:  " + sum);
}

}
