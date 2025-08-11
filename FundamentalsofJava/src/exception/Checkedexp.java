package exception;
//For Checked(CompileTime Exception) extends the class Exception 
//For Checked exception throws must be placed in the method signature
//For Unchecked (Runtime Exception) extends the class RuntimeException 
//For Unchecked exception throws is an optional
   class InsufficientBalanceException extends RuntimeException{
	   InsufficientBalanceException(String message){
		   super(message);
	   }
   }
   class ATM{
	   private int balance=20000;
	   void withdraw(int amount)  {
		   if(amount>balance) {
			   throw new InsufficientBalanceException("Insufficient Balance. Available Balance is "+balance);
		   }
		   balance-=amount;
		   System.out.println("Withdrawal successful. Remaining balance is "+ balance);
	   }
   }
   public class Checkedexp {
	   public static void main(String[] args) {
		   ATM atm=new ATM();
		   try {
			   atm.withdraw(16000);
		   }
		   catch(InsufficientBalanceException e) {
			   System.out.println(e.getMessage());
		   }
	   }
   }


