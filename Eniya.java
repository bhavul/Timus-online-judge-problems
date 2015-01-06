import java.util.Scanner;

public class Eniya{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int number=1;
		while(in.hasNext()){
			number *= in.nextInt();
		}
		System.out.println(number*2);
	}
}