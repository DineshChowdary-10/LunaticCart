package service;

import model.Product;
import dao.ProductDAO;

import java.util.List;

public class ProductService {
	
	private ProductDAO productDAO = new ProductDAO();
	
	public List<Product> getProducts()
	{
		return productDAO.getAllProducts();
	}

}
