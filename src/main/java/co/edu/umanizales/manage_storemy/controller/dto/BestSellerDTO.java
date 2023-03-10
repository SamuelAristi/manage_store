package co.edu.umanizales.manage_storemy.controller.dto;

import co.edu.umanizales.manage_storemy.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BestSellerDTO {
    private Seller seller;
    private int quantity;
}
