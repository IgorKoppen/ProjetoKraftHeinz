package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Tag;
import com.kraftheinz.kraftheinzbackend.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public int count(){
        int count = 0;
        tagRepository.count();
        return count;
    }
    public List<Map<String, Object>> getCountAvalicaoByTag(){
        return tagRepository.countAvaliacoesClientesByTagName();
    }

    public List<Tag> delete(Long cod) {
        tagRepository.deleteById(cod);
        return list();
    }
}
