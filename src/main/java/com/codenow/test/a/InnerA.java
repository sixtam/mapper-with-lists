package com.codenow.test.a;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Serdeable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InnerA {
    private String x;
}
