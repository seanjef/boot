## 嘗試用最新版gradle 5.4.1 與 JDK12 去建構 Spring boot 微服務專案
### build.gradle新增
plugins {
    id 'java'
    id 'org.springframework.boot' version '2.1.5.RELEASE'
    id 'io.spring.dependency-management' version '1.0.7.RELEASE'
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    compile("org.springframework.boot:spring-boot-starter-web")
    //classpath("org.springframework.boot:spring-boot-gradle-plugin:1.5.10.RELEASE")
}
### 其他就依循Spring Boot 啟動設計Java 的 @SpringBootApplication