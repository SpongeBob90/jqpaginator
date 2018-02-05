package com.wyw.jqpaginator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\2\5 0005 13:35
 */
@Controller
public class PageNavigationController {

    @GetMapping(value = "/index")
    public String pageNavigation() {
        return "html/pageNavigation.html";
    }

}
