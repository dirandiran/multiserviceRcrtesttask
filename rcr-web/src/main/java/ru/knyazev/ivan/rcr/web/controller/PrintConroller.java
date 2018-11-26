package ru.knyazev.ivan.rcr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import ru.knyazev.ivan.rcr.web.dto.Document;
import ru.knyazev.ivan.rcr.web.dto.DocumentDTO;
import ru.knyazev.ivan.rcr.web.dto.ResponseListDocumentsDTO;
import ru.knyazev.ivan.rcr.web.services.KafkaService;

import java.util.List;

@RestController
public class PrintConroller {

    @Value("${backend.service.address}")
    String backendServiceAddress;

    private final RestTemplate restTemplate;
    private KafkaService kafkaService;

    @Autowired
    public PrintConroller(RestTemplate restTemplate, KafkaService kafkaService){
        this.restTemplate = restTemplate;
        this.kafkaService = kafkaService;
    }

    /*@GetMapping("/")
    public String start(Model model){

        //List<Document> documents = ;
        model.addAttribute("documents", getDocs());
        model.addAttribute("sort", "ASC");
        return "/index";
    }*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView actionGet() {
        ModelAndView modelAndView = new ModelAndView("index");
        //List<Document> documents = sortDocs(sortTimeprintMethod);
        modelAndView.addObject("documents",getDocs());
        modelAndView.addObject("sort","ASC");
        return modelAndView;
    }

    @PostMapping("/start")
    public void sendKafkaMessege(){
        /*ResponseListDocumentsDTO response = restTemplate.getForObject(backendServiceAddress+"/documents", ResponseListDocumentsDTO.class);
        return response.getDocuments();*/
        kafkaService.send("Hello World!");
    }
    @PostMapping("/stop")
    public List<DocumentDTO> stopPrint(){

        return null;
    }
    private List<Document> getDocs(){
        ResponseListDocumentsDTO response = restTemplate.getForObject(backendServiceAddress+"/documents", ResponseListDocumentsDTO.class);

        return response.getDocuments();
    }
}
