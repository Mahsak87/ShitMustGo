package com.helpwithrecycling.helpwithrecycling.data.repository;

import com.helpwithrecycling.helpwithrecycling.data.entity.Chats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chats, Long> {

    List<Chats> findByCustomerId(final long id);

    List<Chats> findByDriverId(final long id);

    List<Chats> findByCustomerIdAndDriverId(final long customerId , final long driverId);
}
