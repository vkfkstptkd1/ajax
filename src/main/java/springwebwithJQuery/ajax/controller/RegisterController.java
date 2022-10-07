package springwebwithJQuery.ajax.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springwebwithJQuery.ajax.dto.ProductDto;
import springwebwithJQuery.ajax.dto.ProductForm;
import springwebwithJQuery.ajax.mapper.ProductMapper;
import springwebwithJQuery.ajax.service.ProductService;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final ProductService productService;

    @GetMapping(value="/register.html")
    public String registerForm(){
        return "register";
    }
    @RequestMapping(value = "/register.html", method=RequestMethod.POST, consumes="application/json;")
    public String createProduct(@RequestBody ProductForm productform, Model model) throws Exception {

        ProductDto productDto = new ProductDto();
        productDto.setProductId(productform.getProductId());
        productDto.setProductName(productform.getProductName());
        productDto.setStockQuantity(productform.getStockQuantity());
        productDto.setPrice(productform.getPrice());
        productDto.setShortInfo(productform.getShortInfo());
        productDto.setScore(productform.getScore());

        productService.saveProduct(productDto);

        System.out.println(productform);
        model.addAttribute("productForm",productform);

        return "register";
    }
}
