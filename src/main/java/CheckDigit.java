public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and    
   *  six, inclusive.  
   *          num >= 0  
   */  
   public static int getCheck(int num) 
   {  
     /* to be implemented in part (a) */

     int adder = 0;
     int multiplier = 7;
     for (int i = 1; i <= getNumberOfDigits(num); i++){
        adder = adder + (getDigit(num,i) * multiplier);
        multiplier--;
     }
     return (getDigit(adder, getNumberOfDigits(adder)));
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     /* to be implemented in part (b) */    

     int storer = getCheck(numWithCheckDigit/10);
     if (storer == (numWigthCheckDigit % 10)){
        return true;  
     }
     return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
