package com.example.custompetclinic.services;

import com.example.custompetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
    Vet findByLastName(String lastName);
}
