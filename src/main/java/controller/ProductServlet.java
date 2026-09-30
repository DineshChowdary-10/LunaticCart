package controller;
import model.Product;

import java.io.IOException;

import dao.ProductDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductService;

import java.util.List;



@WebServlet("/products")



public class ProductServlet extends HttpServlet{
	private ProductService productservice = new ProductService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {

	    String id = request.getParameter("id");

	    if (id == null) {

	        List<Product> products = productservice.getProducts();

	        request.setAttribute("products", products);

	        RequestDispatcher dispatcher =
	                request.getRequestDispatcher("products.jsp");

	        dispatcher.forward(request, response);

	    } else {

	        Integer productId = Integer.parseInt(id);

	        Product product = productservice.getProductById(productId);

	        request.setAttribute("product", product);

	        RequestDispatcher dispatcher =
	                request.getRequestDispatcher("product-details.jsp");

	        dispatcher.forward(request, response);
	    }
	}
				
		
	}
	
	


