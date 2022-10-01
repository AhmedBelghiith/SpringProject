package tn.spring.springboot.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.util.Date;

@Entity
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat ;
    private Date dateDebutContrat ;
    private Date dateFinContrat ;
    private Boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite spacialite;

    @OneToOne
    private Etudiant etudiant;

    public Contrat(Long idContrat, Date dateDebutContrat, Date dateFinContrat, Boolean archive, Specialite spacialite, Etudiant etudiant) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.archive = archive;
        this.spacialite = spacialite;
        this.etudiant = etudiant;
    }

    public Contrat() {

    }

    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Specialite getSpacialite() {
        return spacialite;
    }

    public void setSpacialite(Specialite spacialite) {
        this.spacialite = spacialite;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", dateDebutContrat=" + dateDebutContrat +
                ", dateFinContrat=" + dateFinContrat +
                ", archive=" + archive +
                ", spacialite=" + spacialite +
                ", etudiant=" + etudiant +
                '}';
    }
}
