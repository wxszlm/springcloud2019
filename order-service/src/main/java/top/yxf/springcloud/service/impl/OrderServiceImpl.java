package top.yxf.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.yxf.springcloud.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Object list() {

        Object forObject = restTemplate.getForObject("http://product-service/api/v1/product/list", Object.class);

        System.out.println(forObject);
        return forObject;
    }
}
