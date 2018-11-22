package com.springcloud.springcloud.consumer.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 在加载restTemplates的方法上添加@LoadBalanced注解，使其具有负载均衡的能力，
 * 然后将硬编码的ip地址换成服务提供者的应用名字（application.name属性的值）
 * ribbon默认的负载均衡策略是轮询的,有多种修改负载均衡的策略，可以通过代码，也可以通过配置文件，
 * ribbon:
 *     # 所要采用的策略
 *     NFLoadBalancerRuleClassName: com.netflix.loadbalancer.RandomRule
 */
@Component
public class TemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
