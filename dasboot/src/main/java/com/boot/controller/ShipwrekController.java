package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShipwrekController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> getShipwreckList(){
        //return ShipwreckStub.list();
        return  shipwreckRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck getShipwreck(@PathVariable Long id){
        //return ShipwreckStub.get(id);
        return shipwreckRepository.findById(id).get();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck createShipwreck(@RequestBody Shipwreck shipwreck){
        //return ShipwreckStub.create(shipwreck);
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck updateShipwreck(@RequestBody Shipwreck shipwreck, @PathVariable Long id){
        //return ShipwreckStub.update(id, shipwreck);
        Shipwreck existingObj = shipwreckRepository.findById(id).get();
        BeanUtils.copyProperties(shipwreck, existingObj);
        return shipwreckRepository.saveAndFlush(existingObj);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck deleteShipwreck(@PathVariable long id){
         //return ShipwreckStub.delete(id);
        Shipwreck existingObj = shipwreckRepository.findById(id).get();
        shipwreckRepository.delete(existingObj);
        return existingObj;
    }

}
