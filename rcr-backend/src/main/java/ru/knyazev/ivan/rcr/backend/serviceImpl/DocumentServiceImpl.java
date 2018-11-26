package ru.knyazev.ivan.rcr.backend.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.knyazev.ivan.rcr.backend.entity.Document;
import ru.knyazev.ivan.rcr.backend.repository.DocumentRepository;
import ru.knyazev.ivan.rcr.backend.services.DocumentService;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }

    @Override
    public List<Document> findAllDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public Document findDocumentById(Long id) {
        return documentRepository.findOne(id);
    }

    @Override
    public List<Document> findAllByOrderByTimeprintAsc() {
        return documentRepository.findAllByOrderByTimeprintAsc();
    }
}
