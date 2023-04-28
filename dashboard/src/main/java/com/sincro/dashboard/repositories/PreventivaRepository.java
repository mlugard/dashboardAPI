package com.sincro.dashboard.repositories;

import com.sincro.dashboard.entities.ManutencaoPreventiva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreventivaRepository extends JpaRepository<ManutencaoPreventiva, Integer> {

}
