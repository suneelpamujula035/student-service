package com.student.config;

import com.student.resource.StudentResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig extends ResourceConfig {

    public RestConfig(Class<?>... classes) {
        register(StudentResource.class);
        setApplicationName("api");
    }
}
