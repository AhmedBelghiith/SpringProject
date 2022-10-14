package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
