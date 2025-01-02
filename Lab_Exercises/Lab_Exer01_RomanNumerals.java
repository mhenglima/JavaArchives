import java.util.Scanner;

public class Lab_Exer01{
	public static void main (String[] args){
		String sName;
		char cRoman;
		
		
		//Get the name of the user
		System.out.println( "What is your name? " );
		
		Scanner sc = new Scanner(System.in);
		sName = sc.nextLine();
		
		System.out.println( "Hi " + sName + ", please enter a single character (roman numeral):" );
		cRoman =  sc.nextLine().charAt(0);
		
		//print the equivalent hindu arabic number 
		switch ( cRoman ) {
			
			case 'M':
			case 'm': 
			case 'D':
			case 'd': { System.out.println( "Invalid." );
				break;
			}
			
			case 'I':
			case 'i': { System.out.println( 1 );
				break;
			}
			
			case 'V':
			case 'v': { System.out.println( 5 );
				break;
			}
			
			case 'X':
			case 'x': { System.out.println( 10 );
				break;
			}
			
			case 'L':
			case 'l': { System.out.println( 50 );
				break;
			}
			
			case 'C':
			case 'c': { System.out.println( 100 );
				break;
			}
			default: { System.out.println( "Invalid." );
				break;
			}
			
		}
		
	}
}//endOfLab_Exer01
//Lima,Charmaine 11589191
//11-07-2016