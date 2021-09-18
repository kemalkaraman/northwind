package kodlamaio.nortwind.entities.concretes;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


//@Data lombok ile constructor get ve setler
@Entity  //calasın hangi katmana karşılık geldiğini bu anatasyon ile yapıyor.anatasyon bir clasın çalışma anında onun ile bilgi toplama işlemi
@Table(name="products") //hangi tablo
public class Product {
	
	@Id//primarykey
	@GeneratedValue //id kısmının nasıl artılacağı
    @Column(name="product_id")
	private int id;
    
    @Column(name="category_id")//hangi kolon
	private int categoryId;
	
    @Column(name="product_name")
    private String productName;
	
    @Column(name="unit_price")
    private double unitPrice;
	
    @Column(name="units_in_stock")
	private short unitInStcok;
    
    @Column(name="quantity_per_unit")
	private String quantityPerUnit;
    
    public Product() {
    	
    }
    
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStcok,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStcok = unitInStcok;
		this.quantityPerUnit = quantityPerUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public short getUnitInStcok() {
		return unitInStcok;
	}
	public void setUnitInStcok(short unitInStcok) {
		this.unitInStcok = unitInStcok;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
}
