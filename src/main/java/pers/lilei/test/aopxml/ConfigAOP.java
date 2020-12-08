package pers.lilei.test.aopxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 18:01
 **/
@Configuration
@ComponentScan(basePackages = {"pers.lilei.test.aopxml"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAOP {
}
