package top.yxf.springcloud.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Product
 * @Description: 产品实体类
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/10 11:16
 * @Version:
*/
@Entity(name = "ProductEntity")
@Table(name = "t_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(name = "f_product_name",length = 100)
    private String productName;

    @Column(name = "f_product_image_url",length = 1000)
    private String productImageUrl;

    @Column(name = "f_product_price")
    private double productPrice;

    @Column(name = "f_product_num")
    private Integer productNum;

    @Column(name = "f_product_remark",length = 1000)
    private String productRemark;

    @Column(name = "f_create_time")
    private Date createTime;

    @Column(name = "f_update_time")
    private Date updateTime;

    @Column(name = "f_end_time")
    private Date endTime;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
