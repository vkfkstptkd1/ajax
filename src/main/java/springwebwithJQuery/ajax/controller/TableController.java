package springwebwithJQuery.ajax.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springwebwithJQuery.ajax.dto.ProductDto;
import springwebwithJQuery.ajax.service.ProductService;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class TableController {
    private final ProductService productService;

    @GetMapping(value = "/tables.html")
    public String tableForm(Model model){
        List<ProductDto> productList=productService.productAll();
        model.addAttribute("productList",productList);
        return "tables";
    }

}
