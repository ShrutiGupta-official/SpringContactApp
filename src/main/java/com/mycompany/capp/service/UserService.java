package com.mycompany.capp.service;

import com.mycompany.capp.domain.User;
import com.mycompany.capp.exception.UserBlockedException;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface UserService {
    public static final Integer LOGIN_STATUS_ACTIVE =1;
    public static final Integer LOGIN_STATUS_BLOCKED =2;
    
    public static final Integer ROLE_ADMIN =1;
    public static final Integer ROLE_USER =2;
    
    /**
     * The method handle the user registration task.
     * @param u the new User detail as User object.
     */
    public void register(User u);
   /**
    * The method handles login operation(authentication) using given credentials,
    * it returns User object  when success and null when failed.
    * When user account is blocked an exception will be thrown by this method.
    * @throws UserBlockedException when user account is blocked.
    */
    public User login(String loginName, String password) throws UserBlockedException;
    /**
     * Call this method to get list of registered users.
     * @return 
     */
    public List<User> getUserList();
    /**
     * This method change the user login status for details passed as argument.
     * @param userId
     * @param loginStatus 
     */
    public void changeLoginStatus(Integer userId, Integer loginStatus);
    /**
     * Check the username availability.
     * @param username
     * @return 
     */
    public Boolean isUsernameExist(String username);
}
