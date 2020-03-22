# Grails Micronaut Config Issue

Grails 4.0.3 introduced a bug where configuration loaded into the Micronaut context is not parsed from camelCase to kebab-case.

## Running the example
Run `./gradlew start` to boot up both the backend service and the grails app, or run `./gradlew :service:run` and `./gradlew :service-test:bootRun` seperately.

Navigate to `http://localhost:8080/test` and observe the stacktrace.

The BlogClient is unable to find the blogService service definition from application.groovy.

## Workaround
Change line 6 of application.groovy in service-test to `"blog-service"` or revert to Grails 4.0.2. 
