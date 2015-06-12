package com.ssoward.service;

import com.ssoward.model.Employee;
import com.ssoward.model.Entry;

import java.util.List;

/**
 * Created by ssoward on 2/15/14.
 */
public interface EntryService {
    Employee getLoggedInUser();
    List<Employee> getUsers();
    Employee getUser(String userName);
    void saveUser(Employee praiser);
    void deleteUser(String username);

    void saveEntry(Entry entry);
//    void saveUserCount(Employee praiser);

//    void distributeGive(Give give) throws InsufficientResourcesException;

}
