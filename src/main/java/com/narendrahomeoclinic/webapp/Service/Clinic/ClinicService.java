package com.narendrahomeoclinic.webapp.Service.Clinic;

import com.narendrahomeoclinic.webapp.DTO.Clinic.ClinicProfileDTO;
import com.narendrahomeoclinic.webapp.Model.Clinic.ClinicProfile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public interface ClinicService {

    LocalDate validateLogin(ClinicProfileDTO clinicProfileDTO);

    LocalDate validatelogInAuthPin(ClinicProfileDTO clinicProfile);
}
