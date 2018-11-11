package calc;


	import java.util.Scanner;

	//import javax.naming.InvalidNameException;

	public class calc {
		public static void main(String args[]) {
			String str = "";
			int result = 0;
			Scanner sc= new Scanner(System.in);
			str = sc.nextLine();
			System.out.println(str);
			String prevOp = "+";
			String arr[] = str.split("");
			
			for (int i = 0; i < arr.length; i++) {
				boolean isNum = isNumericValue(arr[i]);
				if (isNum) {
					int num = Integer.parseInt(arr[i]);
					if(prevOp.equals("+")) {
						result = result + num;
					} else if (prevOp.equals("-")) {
						result = result - num;
					} else if (prevOp.equals("*")) {
						result = result * num;
					} else if (prevOp.equals("/")) {
						result = result / num;
					} 
				} else {
					prevOp = arr[i];
	            }
				//System.out.println("result "+result);
			}
			System.out.println("Result "+result);
		}

		public static boolean isNumericValue(String s) {
	        try {
				int i = Integer.parseInt(s);           
	            return true;
			} 
	        catch(NumberFormatException e) {            
				return false;    
			}
		}  
	}



