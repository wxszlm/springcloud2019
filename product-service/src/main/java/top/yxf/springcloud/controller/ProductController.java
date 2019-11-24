package top.yxf.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.yxf.springcloud.domain.Product;
import top.yxf.springcloud.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Product> list(){
        return productService.list();
    }



}
