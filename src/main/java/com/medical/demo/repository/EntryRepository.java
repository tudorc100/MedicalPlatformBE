package com.medical.demo.repository;

import com.medical.demo.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
List<Entry> findAllByUserIdEquals(Long id);


}
