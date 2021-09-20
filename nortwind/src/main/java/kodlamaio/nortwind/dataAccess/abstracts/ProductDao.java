package kodlamaio.nortwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.nortwind.entities.concretes.Product;
import kodlamaio.nortwind.entities.dtos.ProductWithCategoryDto;

//JpaRepository:verilen veri tipi için (product entity anatosyonu ile süslenmiş olan) ve verilen veri tipini primary alanı ile beraber  sorguları hazırlma 

public interface ProductDao extends JpaRepository<Product, Integer> {
	// getBy gördüğü anda tablolara bakıyor where komutu ekliyor ve alanı
	// productName
	// select * from prodcuts where product_name = abc
	Product getByProductName(String productName);

	// ProdcutName ve CategoryId paramterelerini alıyor
	// select * from prodcuts where product_name = abc and categoryId = 123
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	// or veya
	// select * from prodcuts where product_name = abc or categoryId = 123
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	// in
	// select * from prodcuts where category_id in(1,2,3,4)
	List<Product> getByCategoryIn(List<Integer> categories);

	// Contain
	List<Product> getByProductNameContains(String productName);

	// start
	List<Product> getByProductNameStartsWith(String productName);

	// parametreyi : ile alıyoruz
	@Query("From Product where productName=:productName and categoryId=:categoryId")
	List<Product> getByNameAndCategoryId(String productName, int categoryId);

	// join
	//select p.productId,p.productName,c.categoryName from category c inner join Product on c.categoryId=p.categoryId
	@Query("Select new kodlamaio.nortwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
      
}
