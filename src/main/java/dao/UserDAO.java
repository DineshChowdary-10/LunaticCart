package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.DBConnection;

public class UserDAO {

    public User login(String username, String password) {

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {

                Integer id = resultSet.getInt("id");
                String userName = resultSet.getString("username");
                String userPassword = resultSet.getString("password");

                return new User(id, userName, userPassword);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}