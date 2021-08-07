package com.digitalinnovationone.brazilianscitiesapi.staties.repositories;

import com.digitalinnovationone.brazilianscitiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
