package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Tag;
import com.kraftheinz.kraftheinzbackend.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    private TagRepository tagRepository;

    public TagService(TagRepository tagRepository) { this.tagRepository = tagRepository; }
    public List<Tag> create(Tag tag) {
        tagRepository.save(tag);
        return list();
    }
    public List<Tag> list() { return tagRepository.findAll(); }
    public List<Tag> update(Tag tag) {
        tagRepository.save(tag);
        return list();
    }
    public List<Tag> delete(Long cod) {
        tagRepository.deleteById(cod);
        return list();
    }
}
