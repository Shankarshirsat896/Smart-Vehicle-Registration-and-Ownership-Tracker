package com.SVROT.repository;

import com.SVROT.model.OwnershipHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnershipRepository extends JpaRepository<OwnershipHistory, Long> {
}
