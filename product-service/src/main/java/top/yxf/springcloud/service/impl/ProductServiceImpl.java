package top.yxf.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yxf.springcloud.domain.Product;
import top.yxf.springcloud.mapper.ProductMapper;
import top.yxf.springcloud.service.ProductService;

import java.util.List;


/**
 * @ClassName ProductServiceImpl
 * @Description: 产品的具体业务逻辑
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/10 11:34
 * @Version:
*/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.list();
    }
}
