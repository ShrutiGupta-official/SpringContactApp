package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Dell
 */
public class TestUserDAOUpdate {
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       UserDAO userDAO = ctx.getBean(UserDAO.class);
       User u = new User();
       u.setUserId(2);
       u.setName("Anmol Gupta");
       u.setPhone("7894561230");
       u.setEmail("anmol.gupta123@gmail.com");
       u.setAddress("Jhansi UP");
       u.setRole(1);//Admin Role
       u.setLoginStatus(1);//Active
       userDAO.update(u);
       
       
        System.out.println("----------Data Updated--------");
    }
    
}
