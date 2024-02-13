package com.CRUDusingSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUDusingSpringBoot.entity.Tariffplan;

public interface TariffplanRepository extends JpaRepository<Tariffplan, Integer> {

}
