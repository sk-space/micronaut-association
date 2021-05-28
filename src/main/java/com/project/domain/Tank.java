package com.project.domain;

import com.project.utils.enums.FuelType;
import com.project.utils.enums.Status;
import io.micronaut.data.annotation.AutoPopulated;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

import javax.persistence.Id;
import java.util.Set;
import java.util.UUID;

@MappedEntity
public class Tank {
    @Id
    @AutoPopulated
    private UUID code;
    private String name;
    private Double capacity;
    private FuelType fuelType;
    private Status status;
    @Relation(value = Relation.Kind.ONE_TO_MANY, mappedBy = "tank", cascade = Relation.Cascade.ALL)
    private Set<Nozzle> nozzles;

    public UUID getCode() {
        return code;
    }

    public void setCode(UUID code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Nozzle> getNozzles() {
        return nozzles;
    }

    public void setNozzles(Set<Nozzle> nozzles) {
        this.nozzles = nozzles;
    }
}
