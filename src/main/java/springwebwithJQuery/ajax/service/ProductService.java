package springwebwithJQuery.ajax.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springwebwithJQuery.ajax.dto.ProductSearch;
import springwebwithJQuery.ajax.dto.SellInfoDto;
import springwebwithJQuery.ajax.dto.TargetInfoDto;
import springwebwithJQuery.ajax.mapper.ProductMapper;
import springwebwithJQuery.ajax.dto.ProductDto;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    private final ProductMapper productMapper;

    public void saveProduct(ProductDto productDto){
        productMapper.save(productDto);
    }

    //전체조회
    public List<ProductDto> productAll(){
        return productMapper.findAll();
    }

    public ProductDto findProduct(Long id){
        return productMapper.findOne(id);
    }

    public SellInfoDto monthlyPurchase(ProductDto productDto) {
        SellInfoDto sellInfoDto=productMapper.findMonthlyPurchase(productDto);
        return sellInfoDto;
    }

    public TargetInfoDto targetInfo(ProductDto productDto) {
        TargetInfoDto targetInfoDto = productMapper.findTargetInfo(productDto);
        return targetInfoDto;
    }
}
