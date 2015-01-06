import java.util.ArrayList;
import java.util.Scanner;

public class Problem1001 {

 public static void main(String[] args) {
  // open up standard input
   Scanner in = new Scanner(System.in);
 // use a dynamic array because you need to revert input later on
   ArrayList<Long> theNumbers = new ArrayList<Long>();
  try {
    while (in.hasNext()) {
      // prompt the user to enter the argument A
       theNumbers.add(in.nextLong());
    }
  } catch(Exception e) {}
 finally { in.close();}

  // and print it
  for (int i=theNumbers.size()-1; i>=0; i--) {
    System.out.printf("%.4f", Math.sqrt(theNumbers.get(i)));
    System.out.println(); // new line for every square root
  }
 }
}




// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.text.DecimalFormat;

// public class ReverseRoot{
// 	public static void main(String args[]){
// 		BufferedReader br = null;
// 		br = new BufferedReader(new InputStreamReader(System.in));
// 		ArrayList<Double> array = new ArrayList<Double>();			//because Long can handle upto 18 digits. 19 also, I think.
// 		String line;
// 		BigInteger int0;
// 		try{
// 			while((line = br.readLine())!= null){
// 				while(line.length()!=0){
// 					line=line.trim();
// 					// System.out.println("line is :"+line);
// 					String[] numbers = new String[10000];
// 					numbers = line.split(" ");
// 					// for(int i=0;i<numbers.length;i++){
// 					// 	System.out.println(i+" => "+numbers[i]);
// 					// }
// 					// System.out.println("numbers1 is "+numbers[0]);
// 					int0 = new BigInteger(numbers[0]);
// 					array.add(Double.parseDouble(numbers[0]));
// 					line = line.substring(numbers[0].length());
// 					// System.out.println("line length = "+line.length());
// 				}

// 			}
// 			// System.out.println(array);
// 			Collections.reverse(array);
// 			// System.out.println(array);
// 			for(int i=0;i<array.size();i++){
// 				// array.set(i,Math.sqrt(array.get(i))); 			//remove this line.
// 				// Double value = Double.parseDouble(new DecimalFormat("####.####").format(array.get(i)));
// 				// System.out.println(value);
// 				System.out.printf("%.4f\n",array.get(i));
// 			}
			
// 		}
// 		catch(Exception e){
// 			e.printStackTrace();
// 		}
// 	}
// }