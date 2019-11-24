package top.yxf.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yxf.springcloud.service.OrderService;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/list")
    public Object list(){

        return orderService.list();
    }

}
