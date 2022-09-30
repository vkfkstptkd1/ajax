package springwebwithJQuery.ajax.dto;


import lombok.*;

@Data
public class ProductDto {
    private String pType;
    private String Idx;
    private Long productId;
    private String productName;
    private String shortInfo;
    private int price;
    private int stockQuantity;
    private int clickCount;
    private int searchCount;
    private int score;
}
