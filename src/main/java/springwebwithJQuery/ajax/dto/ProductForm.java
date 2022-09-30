package springwebwithJQuery.ajax.dto;

import lombok.Data;

@Data
public class ProductForm {

    private Long productId;
    private String productName;
    private int stockQuantity;
    private int price;
    private String shortInfo;
    private int score;

}
