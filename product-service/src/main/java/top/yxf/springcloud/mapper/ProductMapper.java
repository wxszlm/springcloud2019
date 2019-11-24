package top.yxf.springcloud.mapper;

import top.yxf.springcloud.domain.Product;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description: 商品数据访问层
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/11 20:58
 * @Version:
*/
public interface ProductMapper {

    List<Product> list();

}
