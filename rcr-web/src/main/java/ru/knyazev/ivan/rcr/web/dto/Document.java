package ru.knyazev.ivan.rcr.web.dto;

import lombok.Data;

@Data
public class Document {
    private Long id;
    private int timeprint;
    private String typedocument;
    private String formatpage;
}
