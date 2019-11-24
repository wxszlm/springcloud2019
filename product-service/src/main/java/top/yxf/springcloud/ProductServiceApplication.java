package top.yxf.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ProductServiceApplication
 * @Description: 商品服务
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/4 20:24
 * @Version:
*/
@SpringBootApplication
@EnableEurekaClient
@MapperScan( basePackages= "top.yxf.springcloud.mapper")
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);

        System.out.println("____  ____  ____  ____  __  ______________   _____ __________ _    __________________\n" +
                "   / __ \\/ __ \\/ __ \\/ __ \\/ / / / ____/_  __/  / ___// ____/ __ \\ |  / /  _/ ____/ ____/\n" +
                "  / /_/ / /_/ / / / / / / / / / / /     / /     \\__ \\/ __/ / /_/ / | / // // /   / __/   \n" +
                " / ____/ _, _/ /_/ / /_/ / /_/ / /___  / /     ___/ / /___/ _, _/| |/ // // /___/ /___   \n" +
                "/_/   /_/ |_|\\____/_____/\\____/\\____/ /_/     /____/_____/_/ |_| |___/___/\\____/_____/");
    }

}
