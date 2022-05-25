
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lastDigit,sum=0,a = 0;    
		int inputNumber=185; 
		
		if(a>0)
		{
			
			lastDigit=a%10;
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		System.out.println("Palindrome number is:"+sum);
		}
	}

}
