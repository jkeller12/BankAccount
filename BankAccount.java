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
  return String.valueOf(accountID) +"\t" + "$" +String.valueOf(balance);
}


}
