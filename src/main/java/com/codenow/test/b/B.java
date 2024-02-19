package com.codenow.test.b;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Serdeable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class B {
    private String name;
    private InnerB inner;
    private List<InnerB> list;
}
