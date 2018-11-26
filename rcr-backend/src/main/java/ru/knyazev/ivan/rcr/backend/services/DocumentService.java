package ru.knyazev.ivan.rcr.backend.services;

import ru.knyazev.ivan.rcr.backend.entity.Document;

import java.util.List;

public interface DocumentService {

    List<Document> findAllDocuments();
    Document findDocumentById(Long id);
    List<Document> findAllByOrderByTimeprintAsc();
}
