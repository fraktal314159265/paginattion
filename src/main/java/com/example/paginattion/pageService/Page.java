package com.example.paginattion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Page<T> {
    private List<T> content;
    private List<Integer> pageNumbers;
    private int paginationStep;
    private int pageNumberNow;
}
