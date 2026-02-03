package com.caiohudak.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiohudak.workshopmongo.domain.Post;
import com.caiohudak.workshopmongo.repository.PostRepository;
import com.caiohudak.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService{
 
    @Autowired
    private PostRepository repo;
 
    public Post findById(String id){
        Post user = repo.findById(id).orElseThrow(() -> new RuntimeException("Post não encontrado"));
        if (user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }
}
