package ru.knyazev.ivan.rcr.backend.dto;

import lombok.Data;
import ru.knyazev.ivan.rcr.backend.entity.Document;

import java.util.List;

@Data
public class ResponseListDocumentsDTO {
    public ResponseListDocumentsDTO(){}
    private List<Document> documents;
}
