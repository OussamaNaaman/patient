package ma.emsi.patientproject.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


public class medecin {
    Long id;
    String name;
    String email;
    String specialiyes;
    Collection<rendezVous> RDV;

}
