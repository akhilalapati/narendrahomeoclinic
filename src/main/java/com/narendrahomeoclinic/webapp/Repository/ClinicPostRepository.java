package com.narendrahomeoclinic.webapp.Repository;

import com.narendrahomeoclinic.webapp.Model.Clinic.ClinicPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicPostRepository extends MongoRepository<ClinicPost, Long> {

}
