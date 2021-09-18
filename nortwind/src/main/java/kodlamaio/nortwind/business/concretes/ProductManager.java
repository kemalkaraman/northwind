package kodlamaio.nortwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.nortwind.business.abstracts.ProductService;
import kodlamaio.nortwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nortwind.entities.concretes.Product;

@Service // bu class projede serice görevi görecek diye springe bilgi veriyor
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired // spring gidip arka planda paroductDao intance olabalicek bir tane sınıfı
				// üretiyor ve onu veriyor
	// prodcut daoyu enjecte edecek ortamı vermiş oluyor
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
