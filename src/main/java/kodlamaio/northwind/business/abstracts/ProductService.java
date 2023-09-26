package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {

	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	
	DataResult<List<Product>> getAlSorted();

	Result add(Product product);

	Result delete(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategoryId(String productName,int categoryId);

	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	

}
