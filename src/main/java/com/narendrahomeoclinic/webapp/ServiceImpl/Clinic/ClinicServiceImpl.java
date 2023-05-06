package com.narendrahomeoclinic.webapp.ServiceImpl.Clinic;

import com.narendrahomeoclinic.webapp.DTO.Clinic.ClinicProfileDTO;
import com.narendrahomeoclinic.webapp.Model.Clinic.ClinicProfile;
import com.narendrahomeoclinic.webapp.Repository.ClinicProfileRepository;
import com.narendrahomeoclinic.webapp.Service.Clinic.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    ClinicProfileRepository clinicProfileRepository;

    public LocalDate validateLogin(ClinicProfileDTO clinicProfileDTO) {
        ClinicProfile clinicProfile = clinicProfileRepository.findProfileByName(clinicProfileDTO.getUserName());

        if (clinicProfile.getUserName().equals(clinicProfileDTO.getUserName()) &&
                clinicProfile.getPassword().equals(clinicProfileDTO.getPassword())) {
            return clinicProfile.getLoginTime();
        }

        return null;
    }

    public LocalDate validatelogInAuthPin(ClinicProfileDTO clinicProfileDTO) {
        ClinicProfile clinicProfile = clinicProfileRepository.findProfileByName(clinicProfileDTO.getUserName());

        if (clinicProfile.getPassword().equals(clinicProfileDTO.getPassword()) &&
                clinicProfile.getAuthPin().equals(clinicProfileDTO.getAuthPin())) {
            return clinicProfile.getLoginTime();
        }

        return null;
    }

    public String login(ClinicProfile clinicProfile) {
        ClinicProfile dbDTO = getDBLogin();
        return null;
    }

    public ClinicProfile getDBLogin() {
        return null;
        //return clinicRepository.findById(1L);
    }

}
