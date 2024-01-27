package com.example.paginattion;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor
public class PageService<T> {
    public Page<T> getPage(List<T> list, int pageNumberNow, int paginationStep) {
        List<Integer> pageNumbers = IntStream
                .rangeClosed(1, list.size() / paginationStep)
                .boxed()
                .skip(pageNumberNow - 1)
                .limit(27)
                .toList();
        List<T> content = list.subList((paginationStep * (pageNumberNow - 1)), paginationStep * pageNumberNow);

        return Page.<T>builder()
                .content(content)
                .pageNumberNow(pageNumberNow)
                .paginationStep(paginationStep)
                .pageNumbers(pageNumbers)
                .build();
    }
}
