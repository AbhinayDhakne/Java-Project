package Project1;
import java.util.*;  
class BankDetails {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in); 
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: "); 
        balance = sc.nextLong();  
        if(balance<1000) {
        	System.out.println("Your Account can't be Opened ");
        }
    }  
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt; 
        System.out.println("Your total balance is Rs."+balance);
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        long q = balance - amt;
        if(q>=1000) {
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Your have removed: "+ amt + " Rs......");
	            System.out.println("Balance after withdrawal: " + balance);
	            } 
        }
        else {  
            System.out.println("If you remove Rs." + amt + " than your balance will be less than Rs.1000 \nTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  

