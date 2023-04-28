package com.sincro.dashboard.repositories;

import com.sincro.dashboard.entities.ManutencaoCorretiva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorretivaRepository extends JpaRepository<ManutencaoCorretiva, Integer> {

}
