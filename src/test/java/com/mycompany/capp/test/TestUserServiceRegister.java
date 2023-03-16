package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import com.mycompany.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Dell
 */
public class TestUserServiceRegister {
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       UserService userService = ctx.getBean(UserService.class);
       //TODO: the user details will be taken from User -Reg-Form
       User u = new User();
       u.setName("Avaneendra");
       u.setPhone("5555555555");
       u.setEmail("avil123@gmail.com");
       u.setAddress("Jhansi");
       u.setLoginName("Avi");
       u.setPassword("avi123");
       u.setRole(UserService.ROLE_ADMIN);//Admin Role
       u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);//Active
       userService.register(u);
       
       
        System.out.println("----------User Registered successfully--------");
    }
    
}
