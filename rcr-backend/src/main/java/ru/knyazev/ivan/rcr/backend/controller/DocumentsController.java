package ru.knyazev.ivan.rcr.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.knyazev.ivan.rcr.backend.dto.ResponseListDocumentsDTO;
import ru.knyazev.ivan.rcr.backend.entity.Document;
import ru.knyazev.ivan.rcr.backend.services.DocumentService;

import java.util.List;

@RestController
public class DocumentsController {

    private DocumentService documentService;

    @Autowired
    public DocumentsController(DocumentService documentService){
        this.documentService = documentService;
    }

    @GetMapping("/documents")
    public ResponseListDocumentsDTO getDocuments(){
        ResponseListDocumentsDTO responseListDocumentsDTO = new ResponseListDocumentsDTO();
        responseListDocumentsDTO.setDocuments(documentService.findAllDocuments());
        return responseListDocumentsDTO;
    }

    @GetMapping("/documents/{id}")
    public Document getDocument(@RequestParam("id") Long id){
        return documentService.findDocumentById(id);
    }
}
