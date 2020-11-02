import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		printPI();
		printBinary();
		printHexadecimal();
		printCompare();
		printPlus();
		printReverse();
		printCount();
		printASCII();
		printEven();
		printConvert();
	}

	public static void printPI() {
	double area,perimeter,volume,diameter;
	Scanner scan =new Scanner(System.in);
	System.out.print("Input a radius : ");
	int radius = scan.nextInt();
	perimeter = 2*Math.PI*radius;
	area = Math.PI*radius*radius;
	volume =((Math.PI*Math.pow(radius, 3))*4)/3; 
	diameter = radius+radius;
	System.out.println("radius = "+radius);
	System.out.println("Diameter = "+diameter);
	System.out.println("Perimeter = "+perimeter);
	System.out.println("Area = "+area);
	System.out.println("Volume = "+volume);
		
	}
	
	public static void printBinary() {
		
		int i=1,j;
		System.out.print("Input a number : ");
		Scanner scan =new Scanner(System.in);
		int digit = scan.nextInt();
		int bin_no[] = new int[100];
		
		while(digit!=0) {
			 bin_no[i++]=digit%2;
			 digit=digit/2;
		}
		System.out.print("Binary number = ");
		for(j=i-1;j>0;j--) {
			System.out.print(bin_no[j]);
			
		}
	}
		public static void printHexadecimal() {
			int rem;
			String hex_num="";
			
			char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			System.out.println("");
			System.out.print("Input a number = ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			
			while(number>0) {
				rem = number%16;
				hex_num = hex[rem]+hex_num;
				number=number/16;
			}
			
			System.out.println("Hexadecimal number is :"+ hex_num);
		}
	
		public static void printCompare() {
			Scanner scan =  new Scanner(System.in);
			System.out.print("Input  Integer 1 = ");
			int A = scan.nextInt();
			System.out.print("Input  Integer 2 = ");
			int B = scan.nextInt();
			
			
			if(A!=B) {
				System.out.println(A+"!="+B);
			}
			if (A==B){
				System.out.println(A+"="+B);
			}
			if (A<B){
				System.out.println(A+"<"+B);
			}
			if (A>B){
				System.out.println(A+">"+B);
			}	
			if (A<=B){
				System.out.println(A+"<="+B);
			}
			if (A>=B){
				System.out.println(A+">="+B);
			}		
		}
		
		public static void printPlus() {
			int digit,rem=0;
			
			Scanner scan =  new Scanner(System.in);
			System.out.print("Input  Integer  = ");
			int num= scan.nextInt();
			
			while(num>0) {
				rem += num%10;
				num=num/10;
			}
			System.out.println("number is :"+ rem);
		
		}
		
		public static void printReverse() {
			Scanner scan = new Scanner(System.in);
			System.out.print("ENTER A SENTENCE : ");
			char[] letters = scan.nextLine().toCharArray();
			System.out.print("reverse : ");
			
			for(int i=letters.length-1;i>=0;i--) {
				System.out.print(	letters[i]);
				}
			System.out.println("");
			System.out.print("normal : ");
			for(int j=0;j<letters.length;j++) {
				System.out.print(	letters[j]);
				}
		}
		
		public static void printCount() {
			String words = "helo my name is ali2.0 from earth5.997";
			char[] ch = words.toCharArray();
			int letter = 0;
			int space = 0;
			int num = 0;
			int other = 0;
			for(int i=0;i<words.length();i++) {
				if(Character.isLetter(ch[i])) {
					letter++;
				}else if(Character.isSpaceChar(ch[i])) {
					space++;
				}else if(Character.isDigit(ch[i])){
					num ++ ;
				}else{
					other ++;
				}
			}
			System.out.println("helo my name is ali2.0 from earth5.997");
			System.out.println("number of letter = "+letter);
			System.out.println("number of space = "+space);
			System.out.println("number of digit = "+num);
			System.out.println("number of other = "+other);
		}
		
		public static void printASCII() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a character = ");
			char chr = scan.next().charAt(0);
			int charat = chr;
			System.out.println("The ASCII value of "+chr+" is : "  +charat);
		}
		
		public static void printEven() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number = ");
			int num = scan.nextInt();
			if(num%2==0) {
				System.out.println("It is an EVEN number");
			}else {
				System.out.println("It is an ODD number");
			}

		}
		
		
		public static void printConvert() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number(string) = ");
			String stg = scan.nextLine();
			int number = Integer.parseInt(stg);
			System.out.println(number+100);
		}
		
		
		
		
		
		
		
	
	
		
}
