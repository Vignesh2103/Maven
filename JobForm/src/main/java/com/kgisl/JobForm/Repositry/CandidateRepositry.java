package com.kgisl.JobForm.Repositry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kgisl.JobForm.Model.*;
/**
 * CandidateRepositry
 */
@Repository
public interface CandidateRepositry extends JpaRepository<Candidate, Long>{

    
}