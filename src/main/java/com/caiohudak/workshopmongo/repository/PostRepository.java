package com.caiohudak.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.caiohudak.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}
