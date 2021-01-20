package com.codegym.repository;

import com.codegym.model.Transitcar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransitcarRepository extends PagingAndSortingRepository<Transitcar, Long> {

}
