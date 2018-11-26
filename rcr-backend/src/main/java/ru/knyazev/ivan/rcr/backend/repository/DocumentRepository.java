package ru.knyazev.ivan.rcr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.knyazev.ivan.rcr.backend.entity.Document;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    List<Document> findAllByOrderByTimeprintAsc();
}
