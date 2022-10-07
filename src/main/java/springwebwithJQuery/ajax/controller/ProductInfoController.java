package springwebwithJQuery.ajax.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springwebwithJQuery.ajax.dto.ProductDto;
import springwebwithJQuery.ajax.dto.ProductSearch;
import springwebwithJQuery.ajax.dto.SellInfoDto;
import springwebwithJQuery.ajax.dto.TargetInfoDto;
import springwebwithJQuery.ajax.service.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductInfoController {

    private final ProductService productService;

    @GetMapping(value="/productinfo.html")
    public String productInfoForm(){
        return "productinfo";
    }
    @GetMapping (value="/findproduct")
    public String findProduct(Model model, ProductSearch productSearch) throws Exception {
        System.out.println(productSearch);

        ProductDto productDto = productService.findProduct(productSearch.getProductId());
        SellInfoDto sellInfoDto = productService.monthlyPurchase(productDto);
        TargetInfoDto targetInfoDto = productService.targetInfo(productDto);

        model.addAttribute("targetInfo",targetInfoDto);
        model.addAttribute("monthlypurchase",sellInfoDto);
        model.addAttribute("product",productDto);

        return "productInfoChart";
    }
}
/* 조회 버튼 클릭ㅇ - 아이디값 및 이름 전달.ㅇ
- db에서 조회 ㅇ - 조건에 맞는 객체 가져오기 -
아이디 값 별 월별 판매량/ 목표량 대비 현재 판매량 조회
- view에 전달 */
