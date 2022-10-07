package springwebwithJQuery.ajax.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springwebwithJQuery.ajax.dto.ProductDto;
import springwebwithJQuery.ajax.service.ProductService;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class TableRestController {

    private final ProductService productService;

    @GetMapping("/product/search")
    public ResponseEntity<?> test(){
        try {
            return new ResponseEntity<>(productService.productAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
