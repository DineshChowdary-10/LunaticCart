package dao;

import model.Product;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()
        ) {

            while (resultSet.next()) {

                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");

                Product product = new Product(id, name, price);

                products.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
    
    public Product getProductById(Integer id)
    {
    	String sql = "SELECT * FROM products where id=?";
    	try {
    		Connection con = DBConnection.getConnection();
    		PreparedStatement pst = con.prepareStatement(sql);
    		
    		pst.setInt(1, id);
    		ResultSet resultSet = pst.executeQuery();
    		if(resultSet.next())
    		{
    			Integer productId = resultSet.getInt("id");
    			String name = resultSet.getString("name");
    			Double price = resultSet.getDouble("price");
    			
    			return new Product(productId,name,price);
    			
    			
    		}
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	return null;
    }
}