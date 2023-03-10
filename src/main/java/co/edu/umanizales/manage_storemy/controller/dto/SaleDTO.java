package co.edu.umanizales.manage_storemy.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaleDTO {
    private String sellerId;
    private String storeId;
    private int quantity;
}