package com.ssoward.controller;

import com.ssoward.model.Page;
import com.ssoward.service.JournalService;
import com.ssoward.service.TestUtil;
import com.ssoward.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by ssoward on 4/18/14.
 */

@Controller
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    TestUtil testUtil;

    @Autowired
    JournalService journalService;

    @Autowired
    EntryService entryService;

    @RequestMapping(method = RequestMethod.GET, value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> fetchPages() {
        List<Page> pages = journalService.getUserPages();
        return new ResponseEntity(pages, HttpStatus.OK);
    }

}
