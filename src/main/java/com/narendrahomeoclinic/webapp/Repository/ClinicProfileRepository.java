package com.narendrahomeoclinic.webapp.Repository;

import com.narendrahomeoclinic.webapp.Model.Clinic.ClinicProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicProfileRepository extends MongoRepository<ClinicProfile, String> {

    @Query("{userName:'?0'}")
    ClinicProfile findProfileByName(String name);
}
