package com.codenow.test.a;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Serdeable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class A {
    private String name;
    private InnerA inner;
    private List<InnerA> list;
}
