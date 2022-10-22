package com.example.custompetclinic.services;

import com.example.custompetclinic.models.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
