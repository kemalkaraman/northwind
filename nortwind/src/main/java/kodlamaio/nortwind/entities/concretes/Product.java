package kodlamaio.nortwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok ile constructor get ve setler
@Entity // calasın hangi katmana karşılık geldiğini bu anatasyon ile yapıyor.anatasyon
		// bir clasın çalışma anında onun ile bilgi toplama işlemi
@Table(name = "products") // hangi tablo
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id // primarykey
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id kısmının nasıl artılacağı
	@Column(name = "product_id")
	private int id;

	// @Column(name="category_id")
//	private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitInStcok;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
}
