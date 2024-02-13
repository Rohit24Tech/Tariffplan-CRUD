package com.CRUDusingSpringBoot.service;

import java.util.List;

import com.CRUDusingSpringBoot.dto.TariffplanDTO;
import com.CRUDusingSpringBoot.entity.Tariffplan;

public interface TariffplanService {
	void updateStatus(Integer id, TariffplanDTO tariffplanDTO);

    List<Tariffplan> getTariffplan();

    void addTariffplan(Tariffplan tariffplan);

    Tariffplan getTariffplan(Integer id);

    void updateTariffplan(Integer id, Tariffplan tariffplan);

    void deleteTariffplan(Integer id);
}
