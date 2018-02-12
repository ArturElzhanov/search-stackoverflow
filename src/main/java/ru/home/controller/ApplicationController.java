package ru.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.home.domain.SearchBuilder;
import ru.home.domain.StackOverflowPosts;
import ru.home.service.SearchStackOverflowService;


@Controller
@RequestMapping("/search")
public class ApplicationController {

    private SearchStackOverflowService service;

    public ApplicationController(SearchStackOverflowService service) {
        this.service = service;
    }

    @GetMapping
    public String getSearchPage(Model model){
        model.addAttribute("posts", new StackOverflowPosts().getItems());
        return "search";
    }

    @GetMapping(params = {"searchInTitleText","sortBy"})
    public String getPosts(@RequestParam String searchInTitleText,
                           @RequestParam String sortBy,
                           Model model) {
        if (service.checkRequestData(searchInTitleText.trim())) {
            model.addAttribute("posts", service.getPosts(new SearchBuilder(searchInTitleText, sortBy)).getItems());
        } else {
            model.addAttribute("checkErrorMessage", "Please, use English symbols!");
        }
        return "search";
    }
}
