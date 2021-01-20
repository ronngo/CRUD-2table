package com.codegym.repository;

import com.codegym.model.Cargos;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CargosRepository extends PagingAndSortingRepository<Cargos,Long> {
}
