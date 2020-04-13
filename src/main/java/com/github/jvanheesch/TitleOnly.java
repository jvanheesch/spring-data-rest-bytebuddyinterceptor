package com.github.jvanheesch;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "titleOnly", types = Book.class)
public interface TitleOnly {
    String getTitle();
}
