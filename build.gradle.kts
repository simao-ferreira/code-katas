plugins {
    kotlin("jvm") version "1.6.20"
    java
    groovy
}

group = "io.code-katas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
	compileOnly("org.projectlombok:lombok:1.18.22")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.codehaus.groovy:groovy-all:3.0.10")
    testImplementation("org.spockframework:spock-core:2.1-groovy-3.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}