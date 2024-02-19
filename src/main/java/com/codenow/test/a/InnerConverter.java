package com.codenow.test.a;

import com.codenow.test.b.InnerB;
import io.micronaut.context.annotation.Mapper;
import io.micronaut.core.convert.ConversionContext;
import io.micronaut.core.convert.TypeConverter;

import jakarta.inject.Singleton;
import java.util.Optional;

@Singleton
public abstract class InnerConverter implements TypeConverter<InnerB, InnerA> {
    @Override
    public Optional<InnerA> convert(
            InnerB object,
            Class<InnerA> targetType,
            ConversionContext context
    ) {

        if (object == null) {
            return Optional.empty();
        }


        return Optional.of(toInnerA(object));
    }


    @Mapper
    public abstract InnerA toInnerA(InnerB inner);

}