package com.example.PMAS.controller;
import com.example.PMAS.model.Patient;
import com.example.PMAS.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@RestController
@RequestMapping("/api/medications")
public class Medicationcontroller {
	@Autowired
    private MedicationService medicationService;

    // View prescribed medications for a patient
    @GetMapping("/{patientId}")
    public ResponseEntity<List<Medication>> getMedicationsByPatient(@PathVariable Long patientId) {
        List<Medication> medications = medicationService.getMedicationsByPatientId(patientId);
        return ResponseEntity.ok(medications);
    }

    // Add a new medication
    @PostMapping("/{patientId}/add")
    public ResponseEntity<Medication> addMedication(@PathVariable Long patientId, @RequestBody Medication medication) {
        Medication createdMedication = medicationService.addMedication(patientId, medication);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMedication);
    }

    // Edit an existing medication
    @PutMapping("/{id}")
    public ResponseEntity<Medication> editMedication(@PathVariable Long id, @RequestBody Medication updatedMedication) {
        Medication medication = medicationService.updateMedication(id, updatedMedication);
        return ResponseEntity.ok(medication);
    }

    // Delete a medication
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long id) {
        medicationService.deleteMedication(id);
        return ResponseEntity.noContent().build();
    }
}

}
