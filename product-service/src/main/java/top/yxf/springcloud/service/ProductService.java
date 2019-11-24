package top.yxf.springcloud.service;


import top.yxf.springcloud.domain.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description: 商品的业务接口
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/11 20:53
 * @Version:
*/
public interface ProductService {


    List<Product> list();

}
