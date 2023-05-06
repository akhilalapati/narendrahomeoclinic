package com.narendrahomeoclinic.webapp.Controller.Clinic;

import com.narendrahomeoclinic.webapp.DTO.Clinic.ClinicProfileDTO;
import com.narendrahomeoclinic.webapp.Model.Clinic.ClinicProfile;
import com.narendrahomeoclinic.webapp.Service.Clinic.ClinicService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RequestMapping("/Clinic")
@RestController
public class ClinicResource {

    @Autowired
    ClinicService clinicService;

    @GetMapping("/login")
    public LocalDate validateLogin(@RequestBody ClinicProfileDTO clinicProfileDTO) {
        return clinicService.validateLogin(clinicProfileDTO);
    }

    @GetMapping("/home")
    public String getHome(){
     return "We are in clinic application";
    }

    @PostMapping("/login/authPin")
    public LocalDate validatelogInAuthPin(@RequestBody ClinicProfileDTO clinicProfileDTO) {
        return clinicService.validatelogInAuthPin(clinicProfileDTO);
    }
}
