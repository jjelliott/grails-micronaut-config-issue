package service.test;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{
    List<BlogPost> findAll();
    BlogPost getById(Long id);
}
