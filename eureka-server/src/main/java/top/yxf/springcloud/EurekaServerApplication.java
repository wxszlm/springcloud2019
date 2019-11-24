package top.yxf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description: 服务注册中心
 * @Author: wuxiangsheng
 * @CreateDate: 2019/11/3 21:23
 * @Version:
*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);

        System.out.println("\n" +
                "    ________  ______  ________ __ ___       _____ __________ _    ____________ \n" +
                "   / ____/ / / / __ \\/ ____/ //_//   |     / ___// ____/ __ \\ |  / / ____/ __ \\\n" +
                "  / __/ / / / / /_/ / __/ / ,<  / /| |     \\__ \\/ __/ / /_/ / | / / __/ / /_/ /\n" +
                " / /___/ /_/ / _, _/ /___/ /| |/ ___ |    ___/ / /___/ _, _/| |/ / /___/ _, _/ \n" +
                "/_____/\\____/_/ |_/_____/_/ |_/_/  |_|   /____/_____/_/ |_| |___/_____/_/ |_|  \n" +
                "                                                                               ");
    }

}
