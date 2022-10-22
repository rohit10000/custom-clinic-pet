package com.example.custompetclinic.services;

import com.example.custompetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
