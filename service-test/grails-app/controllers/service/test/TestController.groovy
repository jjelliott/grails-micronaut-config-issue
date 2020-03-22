package service.test

import javax.inject.Inject

class TestController {

    @Inject
    BlogClient client

    def index() {
        println client.list()
        respond client.list()
    }
}
