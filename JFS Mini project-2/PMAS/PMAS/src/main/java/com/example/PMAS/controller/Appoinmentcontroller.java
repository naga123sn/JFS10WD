package com.example.PMAS.controller;
import com.example.PMAS.model.Patient;
import com.example.PMAS.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@RestController
@RequestMapping("/api/appointments")
public class Appoinmentcontroller {
	@Autowired
    private AppointmentService appointmentService;

    // View available appointment slots
    @GetMapping("/available")
    public ResponseEntity<List<AppointmentSlot>> getAvailableSlots() {
        List<AppointmentSlot> slots = appointmentService.getAvailableSlots();
        return ResponseEntity.ok(slots);
    }

    // Book an appointment
    @PostMapping("/book")
    public ResponseEntity<Appointment> bookAppointment(@RequestBody AppointmentRequest request) {
        Appointment appointment = appointmentService.bookAppointment(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(appointment);
    }

    // Cancel an appointment
    @DeleteMapping("/cancel/{id}")
    public ResponseEntity<Void> cancelAppointment(@PathVariable Long id) {
        appointmentService.cancelAppointment(id);
        return ResponseEntity.noContent().build();
    }
}

}
