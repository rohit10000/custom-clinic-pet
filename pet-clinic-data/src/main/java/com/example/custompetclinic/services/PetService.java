package com.example.custompetclinic.services;

import com.example.custompetclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}