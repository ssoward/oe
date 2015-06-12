package com.ssoward.service;

import com.ssoward.model.Page;

import java.util.List;

/**
 * Created by ssoward on 11/22/14.
 */
public interface JournalService {
    Page getPage(Long id);
    List<Page> getUserPages();
    void savePage(Page page);
    void deletePage(Long pageId);
}
