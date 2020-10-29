public class BankAccount
{
//Instance variables
private double balance;
private final int accountID;
private String password;

//Constructor

public BankAccount(int ID, String Pass)
{
  balance = 0;
  accountID = ID;
  password = Pass;

  //password = password_set;
}


// getmethods

public double getBalance()
{
  return balance;
}

public int getAccountID()
{
  return accountID;
}
//Instance methods

public String getPassword()
{
  return password;
}

public void setPassword(String newPass)
{
  password = newPass;
}

public boolean deposit(double amount)
{
  if (amount >= 0.0)
  {
    balance += amount;
    return true;
  }
  return false;
}

public boolean withdraw(double amount)
{
  if (amount >= 0.0 && amount <= balance)
  {
    balance -= amount;
    return true;
  }
  return false;
}

public String toString()
{
  return "+" + String.valueOf(accountID) +"\t"  + "$" + String.valueOf(balance);
}


private boolean authenticate(String password)
{
/*This private method will allow internal methods to check
the password easily
Determine if the password in the object is the same as the parameter.
@param password to be checked against the object's password
(remember the distinction between this.x and x)
@return true if the passwords are the same, false otherwise.
 */
return this.password.equals(password);

}


public boolean transferTo(BankAccount other, double amount, String password)
{
 /*Transfer money from this BankAccount to the other only when the password matches,
 and the withdrawal succeeds.
 @param other which BankAccount to GIVE the money to
 @param amount how much money to transfer, negative amounts will make this
 operation fail.
 @param password to be checked against the source account, incorrect password
 will make this operation fail.
 @return true if money is successfully transfered, false otherwise.
 */

 if (authenticate(password) && withdraw(amount))
 {
   if (other.deposit(amount))
   {
     return true;
   }

 }
 return false;


}


}
