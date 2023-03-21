package com.helpwithrecycling.helpwithrecycling.data.repository;

import com.helpwithrecycling.helpwithrecycling.data.entity.Garbage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GarbageRepository extends JpaRepository<Garbage, Long> {

    List<Garbage> findAllBy();

    Garbage findById(final long id);

    List<Garbage> findByCustomerId(final long customerId);

    List<Garbage> findByDriverId(final long driverId);

}
