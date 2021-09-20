package kodlamaio.nortwind.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//iki tabloya join atarak yeni alanları istedğimiz bir tablo

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	private int id;
	private String prodcutName;
	private String categoryName;
}
