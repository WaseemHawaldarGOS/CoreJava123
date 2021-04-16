package oops.abstractconcept;

public class OracleDatabaseDriver extends DatabaseDriver {


    public OracleDatabaseDriver(String dbURL, String username, String password) {
        super(dbURL, username, password);
    }



    @Override
    public String DatabaseDriveImpl() {
        DatabaseModel databaseModel = getUpdatedDBDetails(this.dbURL, this.username, this.password);
        return "Welcome to Oracle database driver program. \n Paramaters are "+databaseModel.getDbURL() +
                ", "+databaseModel.getUsername() +","+databaseModel.getPassword();
    }
}
