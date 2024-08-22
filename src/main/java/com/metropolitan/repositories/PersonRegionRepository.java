package com.metropolitan.repositories;

import com.metropolitan.models.PersonRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRegionRepository extends JpaRepository<PersonRegion,Integer> {
    List<PersonRegion> findByNocRegionId(Integer nocRegionId);
}
