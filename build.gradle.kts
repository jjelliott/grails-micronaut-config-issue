/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

tasks.register("start"){
    group = "application"
    dependsOn(":service:run", ":service-test:bootRun")
}

