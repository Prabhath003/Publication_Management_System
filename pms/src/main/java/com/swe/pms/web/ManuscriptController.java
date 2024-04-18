package com.swe.pms.web;

import org.springframework.web.bind.annotation.RestController;

import com.swe.pms.domain.Manuscript;
import com.swe.pms.service.ManuscriptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/manuscripts")
public class ManuscriptController {
    
    @Autowired
    private ManuscriptService manuscriptService;

    @PostMapping
    public ResponseEntity<Manuscript> submitManuscript( @RequestBody Manuscript manuscript) {
        Manuscript submittedManuscript = manuscriptService.submitManuscript(manuscript);
        return ResponseEntity.ok(submittedManuscript);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manuscript> getManuscriptById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manuscript> updateManuscript(@PathVariable Long id, @RequestBody Manuscript manuscript) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManuscript(@PathVariable Long id) {
        return null;
    }

    // Implement other controller methods for manuscript management functionalities (e.g., review assignment, decision management)
}
