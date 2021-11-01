plugins {
    kotlin("jvm") version "1.5.31"
    java
    groovy
}

group = "io.template"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation( "org.codehaus.groovy:groovy-all:3.0.5")
    testImplementation( "org.spockframework:spock-core:2.0-M3-groovy-3.0")
    testImplementation( "org.spockframework:spock-spring:2.0-M3-groovy-3.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}