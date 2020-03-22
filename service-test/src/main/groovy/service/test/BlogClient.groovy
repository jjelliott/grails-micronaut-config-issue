package service.test

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("blogService")
interface BlogClient {

    @Get
    List<BlogPost> list();
}
