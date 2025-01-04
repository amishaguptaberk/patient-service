package com.amisha.patient_management.controllers;

import com.amisha.patient_management.models.Patient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @GetMapping("{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable Integer id){
        Patient patientResponse = new Patient();
        return ResponseEntity.ok(patientResponse);
    }

}

