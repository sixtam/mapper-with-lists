package com.codenow.test;

import com.codenow.test.a.A;
import com.codenow.test.a.InnerA;
import com.codenow.test.b.B;
import com.codenow.test.b.InnerB;
import io.micronaut.context.annotation.Mapper.Mapping;

import jakarta.inject.Singleton;
import java.util.List;

@Singleton
public interface Mapper {

    @io.micronaut.context.annotation.Mapper
    //@Mapping(to = "list", from = "#{this.toInnerAList(b.list)}")
    A toA(B b);

    default List<InnerA> toInnerAList(List<InnerB> list) {
        return list.stream().map(this::toInnerA).toList();
    }

    @io.micronaut.context.annotation.Mapper
    InnerA toInnerA(InnerB inner);

}
