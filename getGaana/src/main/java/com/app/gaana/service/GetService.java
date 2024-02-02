package com.app.gaana.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.app.gaana.model.GaanaEntity;
import com.app.gaana.repo.GetGaanaRepo;

@Service
public class GetService {
	@Autowired
	private GetGaanaRepo repo;
	
	public List<GaanaEntity> getSongByName(String gName){
//		List<GaanaEntity>song = repo.findBygNameContainingIgnoreCase(gName);
//		return song;
//	}
	try {
		System.err.println(gName);
        return repo.findBygNameContainingIgnoreCase(gName);
    } catch (DataAccessException e) {
        // Log the exception or handle it as appropriate for your application
        // You might want to throw a custom exception or return a default value
        e.printStackTrace();
        return Collections.emptyList(); // or throw a custom exception
    }
	}
}
