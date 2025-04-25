package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PageResponse {
    private boolean last;
    private boolean first;
    private boolean empty;
    private int totalPages;
    private int size;
    private int number;
    private int numberOfElements;
    private long totalElements;




}
