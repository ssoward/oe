package com.ssoward.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ssoward.model.enums.GivesStatusEnum;
import com.ssoward.model.enums.GivesTypeEnum;

import java.util.Date;

/**
 * Created by ssoward on 3/5/14.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    public Long   id;
    public String page;
    public Date   date;
    public String title;
    public Long   userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
