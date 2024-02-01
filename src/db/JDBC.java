package db;

import constants.CommonConstants;

import java.sql.*;

public class JDBC {

    public static boolean checkUser(String username) {

        try {
            Connection connection = DriverManager.getConnection(CommonConstants.DB_URL +
                    CommonConstants.DB_USERNAME + CommonConstants.DB_PASSWORD);

            PreparedStatement checkUserExists = connection.prepareStatement(
                    "SELECT * FROM " + CommonConstants.DB_USERS_TABLE_NAME + "WHERE USERNAME = ?"
            );

            checkUserExists.setString(1, username);

            ResultSet resultSet = checkUserExists.executeQuery();

            if(!resultSet.isBeforeFirst()) {
                return false;
            }

        } catch (SQLException error) {
            error.getMessage();
            error.getErrorCode();
            System.out.println("ERROR ERROR ERROR");
        }

        return true;

    }


}