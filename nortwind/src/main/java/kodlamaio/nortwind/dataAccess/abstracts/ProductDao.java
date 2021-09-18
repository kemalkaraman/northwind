package kodlamaio.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.nortwind.entities.concretes.Product;

//JpaRepository:verilen veri tipi için (product entity anatosyonu ile süslenmiş olan) ve verilen veri tipini primary alanı ile beraber  sorguları hazırlma 

public interface ProductDao extends JpaRepository<Product,Integer> {

}
