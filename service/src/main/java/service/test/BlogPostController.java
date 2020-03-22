package service.test;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

@Controller("/blog")
public class BlogPostController{
    
    @Inject
    BlogPostRepository repo;

	@Get
	public List<BlogPost> list(){
        return repo.findAll();
	}

    @Get("/{id}")
    public BlogPost get(long id){
		return repo.getById(id);
    }

    @Post("/")
    public BlogPost create(BlogPost post){
        return repo.save(post);
    }
}
