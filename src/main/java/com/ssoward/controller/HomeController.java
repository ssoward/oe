package com.ssoward.controller;

import com.ssoward.model.Entry;
import com.ssoward.service.TestUtil;
import com.ssoward.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ssoward on 2/22/14.
 */

@Controller
@RequestMapping("/api")
public class HomeController {

    @Autowired
    TestUtil testUtil;

    @Autowired
    EntryService entryService;

    @RequestMapping(method = RequestMethod.POST, value="/entries", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveNewEntry(@RequestBody Entry entry) {
        if(entry != null){
            entryService.saveEntry(entry);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }


}
