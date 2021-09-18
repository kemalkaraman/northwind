package kodlamaio.nortwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.nortwind.business.abstracts.ProductService;
import kodlamaio.nortwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService  productService;
	
	@Autowired //projeyi tarıyor bana kim ProductService impalamte etmiş buluyor burda ProductManager bu sınıfı (ProductManager pm = new ProductManager)
	//şeklinde newliyor (ProductService productService) şöyle birşey lazım(önceki derslerde new leyip vermiştik )
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@RequestMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}

//kodlama.io/api/products
//dış dünyadan bize istek gelirse bu controller yakalacak