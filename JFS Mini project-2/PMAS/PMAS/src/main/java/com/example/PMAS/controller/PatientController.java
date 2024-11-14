package com.example.PMAS.controller;
import com.example.PMAS.model.Patient;
import com.example.PMAS.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@RestController
@RequestMapping("/api/patients")
public class PatientController {
	@Autowired
    private PatientService patientService;

    // Register a new patient
    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient(@RequestBody @Valid Patient patient) {
        Patient createdPatient = patientService.registerPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }

    // Update patient details
    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        Patient patient = patientService.updatePatient(id, updatedPatient);
        return ResponseEntity.ok(patient);
    }

    // View patient profile by ID
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }
}

}

