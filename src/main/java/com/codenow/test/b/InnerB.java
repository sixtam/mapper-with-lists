package com.codenow.test.b;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Serdeable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InnerB {
    private String x;
}
