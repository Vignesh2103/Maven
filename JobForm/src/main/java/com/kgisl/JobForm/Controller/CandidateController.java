package com.kgisl.JobForm.Controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.JobForm.Model.Candidate;
import com.kgisl.JobForm.Repositry.*;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepositry candidateRepositry;


    private final Validator validator;

    public CandidateController(Validator validator) {
        this.validator = validator;
    }

    @PostMapping
    public List<Candidate> submit(@Valid @RequestBody Candidate candidate) {
        return (List<Candidate>) candidateRepositry.save(candidate);
       
    }

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator( (org.springframework.validation.Validator) validator);
    }
    
  

}
