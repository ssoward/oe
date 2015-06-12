package com.ssoward.controller;

import com.ssoward.model.Employee;
import com.ssoward.service.EntryService;
import com.ssoward.service.TestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ssoward on 3/17/14.
 */

@Controller
@RequestMapping("/api")
public class AdminController {

    @Autowired
    TestUtil testUtil;

    @Autowired
    EntryService userService;

//    @Autowired
//    ScheduledTaskService scheduledTaskService;

    @RequestMapping(method = RequestMethod.GET, value = "/loggedIn", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Employee getLoggedInUser(HttpServletRequest request) {
//        scheduledTaskService.loadUserTasks();
        Employee e = userService.getLoggedInUser();
        return e;
    }

}
