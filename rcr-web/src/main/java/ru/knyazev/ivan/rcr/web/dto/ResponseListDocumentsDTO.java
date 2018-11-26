package ru.knyazev.ivan.rcr.web.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseListDocumentsDTO {
    public ResponseListDocumentsDTO(){}
    private List<Document> documents;
}
