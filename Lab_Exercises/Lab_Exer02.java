import java.util.Scanner;

public class Lab_Exer02{
    public static void main( String[] args) {
        //declare variables
        String sName;
        int nYears;
        String nYearsDisp;
        int nRate = 0;
        int nUserChoice;
        int nDay = 1;
        int MAX_DAY_CNT = 15;
        int nAbsent_cnt = 0; 
        double dTax = 0;
        double dBonus = 0;
        


        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter employee's name: " );
        sName = sc.nextLine(); //we get the name of the employee then store it in sName
        System.out.println( "Enter number of years of the employee in the company: " );
        System.out.println( "Choose" );
        System.out.println( "1 if 0-5 years" );
        System.out.println( "2 if 6-10 years" );
        System.out.println( "3 if more than 10 years" );
        nYears = sc.nextInt(); //we get the # of years of the employee in the company then store it in nYears
       

        System.out.println( "Enter employee's daily rate (  greater than 500  ): " );
        nRate = sc.nextInt(); //we get the daily rate of the employee then store it in nRate
        if ( nRate < 500 ) {
            System.out.println( "Please re-enter employee's daily rate, it should be greater than 500: " );
            nRate = sc.nextInt(); //we get the daily rate of the employee then store it in nRate
        }

        while( nDay <=  MAX_DAY_CNT){
            
             System.out.println( "Was " + sName + " absent on Nov " + nDay + " ?");
             System.out.println( "1 for absent, 0 for present" );
             nUserChoice = sc.nextInt();
             System.out.println(""); //print space between inputs

             if (nUserChoice == 1){
                 nAbsent_cnt++;
                 System.out.println( "Deductions recorded." );
                 nDay++;
             }
             else
              nDay++;
        } nDay = nDay - 1; //after reaching 15, the final value of nDay will become 16, so we need to less 1

            int nTotalDeductions = nAbsent_cnt * nRate;
            int nTotalEarning =( nDay * nRate ) - nTotalDeductions;
             
            if (nYears == 1){
                nYearsDisp = "0-5" ;
                dBonus = 0 ;
            }
            else if (nYears == 2){
                nYearsDisp = "6-10" ;
                dBonus =  (nRate * .01) + nTotalEarning  ;
            }
            else {
                nYearsDisp = "more than 10" ;
                dBonus =  ((nRate * .01) + nTotalEarning + 5000 ) ;
            }
    

            System.out.println( "Employee Name: " + sName + ", No. of Years in the company: " + nYearsDisp + " years:" ) ;
            System.out.println( "Payroll period (Nov 1 to 15)" );
            System.out.println( "Total Absences: " + nAbsent_cnt);
            System.out.println( "Total Earnings: "   + nTotalEarning );
            System.out.println( "Total Deductions: " + nTotalDeductions);


            if ( nTotalEarning > 5000 ) {
                dTax = .10;
            }
            else
                dTax = .5;
            
            System.out.println( "Tax Deductions : " + ((int) (dTax * 100)) + "% = " + (nTotalEarning * dTax)) ;
            System.out.println( "Total NET Earnings : " + (nTotalEarning - (nTotalEarning * dTax)) );

            System.out.println( "Bonuses: " + dBonus);
            
            
      
    }//endofmain
}//endofclass