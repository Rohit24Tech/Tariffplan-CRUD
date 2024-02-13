package com.CRUDusingSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CRUDusingSpringBoot.dto.TariffplanDTO;
import com.CRUDusingSpringBoot.entity.Tariffplan;
import com.CRUDusingSpringBoot.service.TariffplanService;

import java.util.List;

@RestController
@RequestMapping("/tariffplan")

public class TariffplanController {
	
	@Autowired
    private TariffplanService tariffplanService;

    @PostMapping("/add")
    public String addTariffplan(@RequestBody Tariffplan tariffplan){
        tariffplanService.addTariffplan(tariffplan);

        return "Successfully added Plan";
    }

    @GetMapping
    public List<Tariffplan> getTariffplan(){
        return tariffplanService.getTariffplan();
    }

    @GetMapping("/get")
    public Tariffplan getTariffplan(@RequestParam Integer id) {
        return tariffplanService.getTariffplan(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateTariffplan(@PathVariable Integer id, @RequestBody Tariffplan tariffplan){
        tariffplanService.updateTariffplan(id, tariffplan);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTariffplan(@PathVariable Integer id){
        tariffplanService.deleteTariffplan(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/update-status/{id}")
    public ResponseEntity<Void> updateStatus(@PathVariable Integer id, @RequestBody TariffplanDTO tariffplanDTO){
        tariffplanService.updateStatus(id, tariffplanDTO);

        return ResponseEntity.noContent().build();
    }

}
