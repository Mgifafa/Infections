package com.zombie.apocalyse.survivor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zombie.apocalyse.report.Report;
import com.zombie.apocalyse.resource.Resource;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Survivor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;
    private Location location;


    @JsonIgnore
    @OneToMany(mappedBy = "survivor")
    private List<Resource> resource;
    @OneToMany(mappedBy = "survivor")
    private List<Report>reports;


    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }


    public int getInfectionReportCount() {
        return infectionReportCount;
    }


    private int infectionReportCount;
    private  int infectedCount;

    public void setInfectionCount(int infectionCount) {
        this.infectionReportCount = infectionCount;
    }

    public int getInfectedCount() {
        return infectedCount;
    }

    public void setInfectedCount(int infectedCount) {
        this.infectedCount = infectedCount;
    }

    private boolean infected;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public Survivor() {
    }

    public List<Resource> getResource() {
        return resource;
    }

    public List<Resource> setResource(Resource resources) {
      return resource;
    }

    public int incrementInfectionReportCount() {
        int incrementInfectionReportCount = 0;
        return incrementInfectionReportCount;
    }
}
