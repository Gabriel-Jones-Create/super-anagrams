import java.util.Scanner;
public class SuperAnTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //creates scanner variable
		String match = s.nextLine();// creates string variable based on the scanners next value
		String initial = s.nextLine();// creates string variable based on the scanners next value
		SuperAnagram mySA = new SuperAnagram(); // constructs a SuperAnagram object with name mySA
		System.out.println(mySA.isSuperAnagram(match,initial));//prints out the SuperAnagram method output
	}
}