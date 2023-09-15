package com.kraftheinz.kraftheinzbackend.controller;

import com.kraftheinz.kraftheinzbackend.model.Produto;
import com.kraftheinz.kraftheinzbackend.model.Tag;
import com.kraftheinz.kraftheinzbackend.service.TagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }
    @PostMapping
    List<Tag> create(@RequestBody Tag tag) {
        return tagService.create(tag);
    }
    @GetMapping
    List<Tag> list() {
        return tagService.list();
    }
    @PutMapping
    List<Tag> update(@RequestBody  Tag tag){
        return tagService.update(tag);
    }

    @DeleteMapping("{cod}")
    List<Tag> delete(@PathVariable("cod") Long cod){
        return tagService.delete(cod);
    }
}
