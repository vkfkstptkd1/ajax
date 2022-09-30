package springwebwithJQuery.ajax.mapper;

import org.apache.ibatis.annotations.Mapper;
import springwebwithJQuery.ajax.dto.ProductDto;

import java.util.List;

@Mapper
public interface ProductMapper {

    void save(ProductDto productDto);
    List<ProductDto> findAll();
}
