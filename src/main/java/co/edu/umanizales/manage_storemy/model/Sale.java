package co.edu.umanizales.manage_storemy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Sale {
    private Store  store;
    private Seller seller;
    private int quantity;

    public Sale(Store findStore, Seller findSeller, int quantity) {
    }
}
