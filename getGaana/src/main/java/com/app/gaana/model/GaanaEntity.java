package com.app.gaana.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="gaanaKaData")
public class GaanaEntity {
	@Id
	String gId;

	public String getgId() {
		return gId;
	}
	public void setgId(String gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgSinger() {
		return gSinger;
	}
	public void setgSinger(String gSinger) {
		this.gSinger = gSinger;
	}
	String gName;
	String gSinger;
	String gPath;

	public String getgPath() {
		return gPath;
	}
	public void setgPath(String gPath) {
		this.gPath = gPath;
	}
	
}
