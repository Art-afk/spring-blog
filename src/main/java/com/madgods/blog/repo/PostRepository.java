package com.madgods.blog.repo;

import com.madgods.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
