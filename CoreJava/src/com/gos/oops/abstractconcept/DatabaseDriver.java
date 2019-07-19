package com.gos.oops.abstractconcept;

public abstract class DatabaseDriver {

    /*
    abstract class variables
     */
    String dbURL;
    String username;
    String password;


    /*
    Constructor
     */
    public DatabaseDriver(String dbURL, String username, String password) {
        this.dbURL = dbURL;
        this.username = username;
        this.password = password;
    }


    /*
    concrete method
     */
    public DatabaseModel getUpdatedDBDetails(String dbURL, String username, String password){
        DatabaseModel databaseModel = new DatabaseModel(dbURL+"abc", username+"abc", password+"abc");
        return databaseModel;
    }


    /*
    Abstract method
     */
    public abstract String DatabaseDriveImpl();


}
