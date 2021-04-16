package oops.abstractconcept;

public class TestAbstractConcept {

    public static void main(String[] args) {

        DatabaseDriver oracleDriver = new OracleDatabaseDriver("jdbc:thin@host", "guest", "guest");
        String oracleDriverResponse = oracleDriver.DatabaseDriveImpl();
        System.out.println("Response received from oracle driver is "+oracleDriverResponse);

        DatabaseDriver mysqlDriver = new MySQLDatabaseDriver("jdbc:thin@host", "devuser", "devpassword");
        String mysqlDriverResponse = mysqlDriver.DatabaseDriveImpl();
        System.out.println("\n\nResponse received from mysql driver is "+mysqlDriverResponse);
    }
}
