package com.narendrahomeoclinic.webapp.Repository;

import com.narendrahomeoclinic.webapp.Model.Shop.ShopPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopRepository extends MongoRepository<ShopPost, Long> {
}
