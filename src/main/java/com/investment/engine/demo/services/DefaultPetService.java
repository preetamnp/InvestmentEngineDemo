package com.investment.engine.demo.services;

import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DefaultPetService implements PetService {

    @Autowired
    private PetApi petApi;

    public List<Pet> findAvailablePets() {
        return petApi.findPetsByStatus(Arrays.asList("available"));
    }

    public List<Pet> findPendingPets() {
        return petApi.findPetsByStatus(Arrays.asList("pending"));
    }

    public List<Pet> findSoldPets() {
        return petApi.findPetsByStatus(Arrays.asList("sold"));
    }

}