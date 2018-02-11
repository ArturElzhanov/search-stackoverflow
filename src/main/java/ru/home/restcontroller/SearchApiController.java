package ru.home.restcontroller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.home.domain.Post;
import ru.home.service.SearchStackOverflowService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchApiController {
    private SearchStackOverflowService service;

    public SearchApiController(SearchStackOverflowService service) {
        this.service = service;
    }

    @GetMapping(params = "searchInTitleText")
    @ApiOperation("Get list of posts by title text")
    public List<Post> getPosts(@RequestParam String searchInTitleText) {
        if (service.checkRequestData(searchInTitleText.trim())) {
            return service.getPosts(searchInTitleText.trim()).getItems();
        } else {
            return new ArrayList<>();
        }
    }

}
