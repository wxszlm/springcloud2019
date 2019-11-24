package top.yxf.springcloud;


import com.netflix.loadbalancer.BaseLoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderServiceApplication
 * @Description: 订单服务启动类
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/10 19:56
 * @Version:
*/

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableDiscoveryClient
public class OrderServiceApplication extends BaseLoadBalancer {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
        System.out.println("\n" +
                "   ____  ____  ____  __________     _____ __________ _    __________________\n" +
                "  / __ \\/ __ \\/ __ \\/ ____/ __ \\   / ___// ____/ __ \\ |  / /  _/ ____/ ____/\n" +
                " / / / / /_/ / / / / __/ / /_/ /   \\__ \\/ __/ / /_/ / | / // // /   / __/   \n" +
                "/ /_/ / _, _/ /_/ / /___/ _, _/   ___/ / /___/ _, _/| |/ // // /___/ /___   \n" +
                "\\____/_/ |_/_____/_____/_/ |_|   /____/_____/_/ |_| |___/___/\\____/_____/   \n" +
                "                                                                            ");
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
