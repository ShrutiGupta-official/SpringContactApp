package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Dell
 */
public class TestDataSource {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql = "INSERT INTO user(`name`,`phone`,`email`,`address`,`loginName`,`password`) VALUES (?,?,?,?,?,?)";
        Object[] param = new Object[]{"Shivansh","0123456789","Shivansh@gmail.com","Agra","Shivi","Shivi@123"};
        jt.update(sql,param);
        System.out.println("----------SQL executed--------");
        
    }
    
}
