package com.app.gaana.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gaana.model.GaanaEntity;
import com.app.gaana.repo.GetGaanaRepo;
import com.app.gaana.service.GetService;

@RestController
@RequestMapping("/get")
public class GetController {
	@Autowired
	private GetService gSrvc;
	@Autowired
	private GetGaanaRepo repo;
	
	@GetMapping("/gaana/{name}")
	public ResponseEntity<List<GaanaEntity>> nameSearch(@PathVariable("name")String name){
		List<GaanaEntity> songList = gSrvc.getSongByName(name);

		songList.stream().forEach(gaanaEntity -> {
		    System.out.println("Song ID: " + gaanaEntity.getgId());
		    System.out.println("Song Name: " + gaanaEntity.getgName());
		    System.out.println("Singer: " + gaanaEntity.getgSinger());
		    // Add other properties if needed
		    System.out.println("---------------");
		});
		return new ResponseEntity<>(songList, HttpStatus.OK);
	}
	@GetMapping("/files")
	public ResponseEntity<List<GaanaEntity>> getAllFiles() {
		return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
	}
}
