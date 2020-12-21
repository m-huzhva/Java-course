package com.company;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class DatabaseUser {
    private Connection connectionObj;
    private Statement statementObj;
    private ResultSet resultSet;
    private final String dbString = "jdbc:mysql://localhost:3306/films";
    private final String userName = "root";
    private final String password = "root";
    private String SQLString ="SELECT * FROM film";

    public void run()
    {
        try
        {
            DriverManager.registerDriver(new com.jdbc.Driver());
            connectionObj = DriverManager.getConnection(dbString,"root","root");
            statementObj = connectionObj.createStatement();
            resultSet = statementObj.executeQuery(SQLString);
            while(resultSet.next())
            {
                System.out.print("Name of Film :"+resultSet.getString("title")+"\t\t Released Year :"+resultSet.getDate("year"));
                System.out.println("");
            }
            if(new Scanner(System.in).next()=="i"){
                System.out.println("Enter film data: id, title, description(text), year(2020-01-01)");
                String id = new Scanner(System.in).next();
                String title = new Scanner(System.in).next();
                String description = new Scanner(System.in).next();
                String year = new Scanner(System.in).next();
                statementObj = connectionObj.createStatement();
                statementObj.executeUpdate("INSERT INTO Customers " +
                        "VALUES " +"("+id + "," + title + "," + description + "," + year+")");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                connectionObj.close();
                statementObj.close();
                resultSet.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }

        }


    }

}
