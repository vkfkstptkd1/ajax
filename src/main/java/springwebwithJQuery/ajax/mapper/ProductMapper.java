package springwebwithJQuery.ajax.mapper;

import org.apache.ibatis.annotations.Mapper;
import springwebwithJQuery.ajax.dto.ProductDto;
import springwebwithJQuery.ajax.dto.ProductSearch;
import springwebwithJQuery.ajax.dto.SellInfoDto;
import springwebwithJQuery.ajax.dto.TargetInfoDto;

import java.util.List;

@Mapper
public interface ProductMapper {


    TargetInfoDto findTargetInfo(ProductDto productDto);

    SellInfoDto findMonthlyPurchase(ProductDto productDto);

    void save(ProductDto productDto);
    List<ProductDto> findAll();

    ProductDto findOne(Long id);
}
