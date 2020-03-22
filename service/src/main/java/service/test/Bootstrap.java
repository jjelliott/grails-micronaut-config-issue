package service.test;

import io.micronaut.context.annotation.Context;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Context
class Bootstrap {

    @Inject
    BlogPostRepository repository;

    @PostConstruct
    public void initDb() {
        System.out.println("Seeding db");
        BlogPost post1 = new BlogPost();
        post1.setTitle("Blog name");
        post1.setSlug("blog-name");
        post1.setContent("Good content!");
        BlogPost post2 = new BlogPost();
        post2.setTitle("Another Blog name");
        post2.setSlug("another-blog-name");
        post2.setContent("Better content!");
        repository.save(post1);
        repository.save(post2);
        System.out.println("database has been seeded");
    }
}
