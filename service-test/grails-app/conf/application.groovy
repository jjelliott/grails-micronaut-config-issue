String serviceUrl = "http://localhost:8081"

micronaut {
    http {
        services{
            blogService{
                url = serviceUrl
                path = "/blog"
            }
        }
    }
}
