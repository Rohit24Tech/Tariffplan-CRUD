package com.CRUDusingSpringBoot.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.CRUDusingSpringBoot.dto.TariffplanDTO;
import com.CRUDusingSpringBoot.entity.Tariffplan;
import com.CRUDusingSpringBoot.repository.TariffplanRepository;
import com.CRUDusingSpringBoot.service.TariffplanService;

@Service
public class TariffplanServiceImpl implements TariffplanService{
	@Autowired
    private TariffplanRepository tariffplanRepository;

    @Override
    public void updateStatus(Integer id, TariffplanDTO tariffplanDTO) {
        Tariffplan tariffplan = tariffplanRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Tariffplan ID: "+id));

        tariffplan.setPlanType(tariffplanDTO.getPlanType());
        
        tariffplan.setPlanType(null);

        tariffplanRepository.save(tariffplan);
    }

    @Override
    public List<Tariffplan> getTariffplan() {
        return tariffplanRepository.findAll();
    }

    @Override
    public void addTariffplan(Tariffplan tariffplan) {
        try {
			tariffplanRepository.save(tariffplan);
		} catch (Exception e) {
		 			e.printStackTrace();
		}

    }

    @Override
    public Tariffplan getTariffplan(Integer id) {
        Tariffplan tariffplan = tariffplanRepository
                .findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid tariffplan ID: " +id));
        return tariffplan;
    }

    @Override
    public void updateTariffplan(Integer id, Tariffplan tariffplan) {
        //Check whether tariffplan is already in the database or not
        tariffplanRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Tariffplan ID: "+id));
        tariffplan.setId(id);

        tariffplanRepository.save(tariffplan);
    }

    @Override
    public void deleteTariffplan(Integer id) {
        //Check weather the Tariffplan is in the database or not
        Tariffplan tariffplan = tariffplanRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Tariffplan ID: "+id));

        tariffplanRepository.delete(tariffplan);

    }
}
