package com.metropolitan.repositories;

import com.metropolitan.models.NocRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NocRegionRepository extends JpaRepository<NocRegion, Integer> {
    List<NocRegion> findByRegionNameContainingIgnoreCase(String regionName);
    List<NocRegion> findByNoc(String nock);
}
