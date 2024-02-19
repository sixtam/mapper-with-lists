package com.codenow.test;

import com.codenow.test.a.A;
import com.codenow.test.b.B;
import com.codenow.test.b.InnerB;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Single;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/test")
@RequiredArgsConstructor
public class TestController {

    private final Mapper mapper;


    @Get
    public Single<A> test(

    ) {


        final var item = InnerB.builder().x("x").build();

        final var b = B.builder()
                       .name("test")
                       .inner(item)
                       .list(List.of(item))
                       .build();

        final A a = mapper.toA(b);

        return Single.just(a);
    }


}
