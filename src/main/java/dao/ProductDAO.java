package dao;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	public List<Product> getAllProducts()
	{
		
		List<Product> products = new ArrayList();
		products.add(new Product(1,"Laptop",55000.0));
		products.add(new Product(2,"KeyBoard",2000.0));
		products.add(new Product(3,"Mouse",1000.0));
		
		return products;
		
	}

}
