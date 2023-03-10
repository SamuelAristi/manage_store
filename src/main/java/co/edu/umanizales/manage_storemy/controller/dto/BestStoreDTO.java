package co.edu.umanizales.manage_storemy.controller.dto;
import co.edu.umanizales.manage_storemy.model.Store;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BestStoreDTO {
    private Store store;
    private int quantity;

}
