package com.interview.restservice.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSnapshotRepository extends JpaRepository<DataSnapshot, Long> {

    Optional<DataSnapshot> findByPK(Long pk);

    List<DataSnapshot> findByUpdatedTimestampBetween(LocalDateTime startUpdatedTimestamp,
            LocalDateTime endUpdatedTimestamp, Pageable pageable);

}
