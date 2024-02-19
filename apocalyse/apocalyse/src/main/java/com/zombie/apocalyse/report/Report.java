package com.zombie.apocalyse.report;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zombie.apocalyse.survivor.Survivor;
import jakarta.persistence.*;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Survivor getReporter() {
        return reporter;
    }

    public void setReporter(Survivor reporter) {
        this.reporter = reporter;
    }

    public Survivor getReported() {
        return reported;
    }

    public void setReported(Survivor reported) {
        this.reported = reported;
    }

    private Survivor reporter;
    private Survivor reported;






    @JsonIgnore
    @ManyToOne
    private Survivor survivor;

    public Survivor getCompany() {
        return survivor;
    }

    public void setCompany(Survivor survivor) {
        this.survivor = survivor;
    }
    
    
    
    
    
    
    
    
    
    
}
