package hexBank;

public class Bank{
  
 DBManager dbManager = new DBManager();

  public String makeConnection(){
    //some connection code here
    String conStr = DBManager.getConnectionString();
    if ( conStr.equals("ORIGINAL"))
      return "SUCCESS";
    else
      return "FAIL";
  }
  public String processAccount( int accountID){
    String accountHolderName =
    dbManager.retrieveAccountHolderName(accountID);
    return accountHolderName;
  }
}