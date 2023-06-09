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
public class TestUserDAOFindSingleRecord {
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       UserDAO userDAO = ctx.getBean(UserDAO.class);
       User u = userDAO.findById(3);
       System.out.println("----------User Detail--------");
       System.out.println(u.getUserId());
       System.out.println(u.getName());
       System.out.println(u.getPhone());
       System.out.println(u.getEmail());
       System.out.println(u.getAddress());
       System.out.println(u.getLoginName());
       System.out.println(u.getLoginStatus());
       System.out.println(u.getRole());
    }
    
}
