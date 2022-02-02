package com.abc.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.abc.boot.bean.Pet;
import com.abc.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1. 相当于配置文件beans.xml，其本身也是一个组件
 * 2. 默认是单实例的实现方式
 * 3. proxyBeanMethods：代理bean的方法，TRUE默认表示在容器中找组件，false不会检查容器中是否存在，直接创建新的对象
 *    组件依赖
 * 4. import给容器创建出组件
 */
@Import({DBHelper.class})
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(User.class)
public class Config {

    // 给容器中添加组件，以方法名称作为组件的ID，返回类型就是组件类型，返回值就是组件在容器中的实例
    @Bean("tom")
    public Pet tomPet() {
        return new Pet("tomcat");
    }
}
