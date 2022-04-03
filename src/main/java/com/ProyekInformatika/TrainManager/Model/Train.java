package com.ProyekInformatika.TrainManager.Model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "trains")
public class Train {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, length = 2048)
    private String description;

    @Column(name = "[distance-between-stop]", nullable = false)
    @JsonProperty("distance-between-stop")
    private String distanceBetweenStop;

    @Column(name = "[max-speed]", nullable = false)
    @JsonProperty("max-speed")
    private String maxSpeed;

    @Column(name = "[sharing-tracks]", nullable = false)
    @JsonProperty("sharing-tracks")
    private Boolean sharingTracks;

    @Column(name = "[grade-crossing]", nullable = false)
    @JsonProperty("grade-crossing")
    private Boolean gradeCrossing;

    @Column(name = "[train-frequency]", nullable = false)
    @JsonProperty("train-frequency")
    private String trainFrequency;

    @Column(name = "amenities", nullable = false)
    private String amenities;
    
    public Train() {}
    
    public Train(Long id, String name, String description, String distanceBetweenStop, String maxSpeed, 
    		Boolean sharingTracks, Boolean gradeCrossing, String trainFrequency, String amenities) {
    	this.id = id;
    	this.name = name;
    	this.description = description;
    	this.distanceBetweenStop = distanceBetweenStop;
    	this.maxSpeed = maxSpeed;
    	this.sharingTracks = sharingTracks;
    	this.gradeCrossing = gradeCrossing;
    	this.trainFrequency = trainFrequency;
    	this.amenities = amenities;
    }
    
    public Long getId() {return this.id;}
    
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    
    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return this.description;}
    
    public void setDistanceBetweenStop(String distanceBetweenStop) {this.distanceBetweenStop = distanceBetweenStop;}
    public String getDistanceBetweenStop() {return this.distanceBetweenStop;}
    
    public void setMaxSpeed(String maxSpeed) {this.maxSpeed = maxSpeed;}
    public String getMaxSpeed() {return this.maxSpeed;}
    
    public void setSharingTracks(Boolean sharingTracks) {this.sharingTracks = sharingTracks;}
    public Boolean getSharingTracks() {return this.sharingTracks;}
    
    public void setGradeCrossing(Boolean gradeCrossing) {this.gradeCrossing = gradeCrossing;}
    public Boolean getGradeCrossing() {return this.gradeCrossing;}
    
    public void setTrainFrequency(String trainFrequency) {this.trainFrequency = trainFrequency;}
    public String getTrainFrequency() {return this.trainFrequency;}
    
    public void setAmenities(String amenities) {this.amenities = amenities;}
    public String getAmenities() {return this.amenities;}
    
    @Override
    public String toString() { 
    	return this.name + "\n" + this.description + "\n" + this.distanceBetweenStop + "\n" + this.maxSpeed + "\n" + this.sharingTracks + "\n";
    }
}
