package com.gos.oops.abstractconcept;

public class MySQLDatabaseDriver extends DatabaseDriver {


    public MySQLDatabaseDriver(String dbURL, String username, String password) {
        super(dbURL, username, password);
    }



    @Override
    public String DatabaseDriveImpl() {
        DatabaseModel databaseModel = getUpdatedDBDetails(this.dbURL, this.username, this.password);
        return "Welcome to MYSQL database driver program. \n Paramaters are "+databaseModel.getDbURL() +
                ", "+databaseModel.getUsername() +","+databaseModel.getPassword();
    }
}
