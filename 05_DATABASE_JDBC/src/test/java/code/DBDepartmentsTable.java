import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.*;
import Utils.DatabaseUtil;

public class DBDepartmentsTable {

    @BeforeTest
    public void setup(){
        DatabaseUtil.createConnection();
    }

    @AfterTest
    public void teardown(){
        DatabaseUtil.closeConnection();
    }

    @Test(description = "Given connected database and departments table when we check the column number then it must be equal to given data")
    public void columnNumber(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM DEPARTMENTS");
        int expectedNumberOfColumnsInDepartmentsTable = 4; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        int actualNumberOfColumnsInDepartmentsTable = 0;

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualNumberOfColumnsInDepartmentsTable = resultSetMetaData.getColumnCount();
        }catch (SQLException throwables){
            System.out.println("system couldn't get Meta Data");
        }

        // Then
        Assert.assertEquals(actualNumberOfColumnsInDepartmentsTable,expectedNumberOfColumnsInDepartmentsTable,"Departments table column count is Incorrect");
    }

    @Test(description = "Given connected database and departments table when we check the first column name then it must be equal to given data")
    public void columnName(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM DEPARTMENTS");
        String expectedFirstColumnNameInDepartmentTable = "DEPARTMENT_ID"; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        String actualFirstColumnNameInDepartmentsTable = "";

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualFirstColumnNameInDepartmentsTable = resultSetMetaData.getColumnName(1);
        }catch (SQLException throwables){
            System.out.println("System couldn't get Meta Data");
        }

        // Then
        Assert.assertEquals(actualFirstColumnNameInDepartmentsTable, expectedFirstColumnNameInDepartmentTable, "First Column Name in the Departments Table is Incorrect");
    }
}
