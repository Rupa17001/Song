package com.app.gaana.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.gaana.model.GaanaEntity;
import java.util.List;


public interface GetGaanaRepo extends MongoRepository<GaanaEntity,String> {

	List<GaanaEntity> findBygNameContainingIgnoreCase(String gName);
}
