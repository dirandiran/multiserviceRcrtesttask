package ru.knyazev.ivan.rcr.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Document(){}

    public Document(int timeprint, String typedocument, String formatpage ){
        this.timeprint = timeprint;
        this.typedocument = typedocument;
        this.formatpage = formatpage;
    }
    private int timeprint;

    private String typedocument;

    private String formatpage;
}
