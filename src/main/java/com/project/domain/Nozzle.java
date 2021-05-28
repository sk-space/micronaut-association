package com.project.domain;

import com.project.utils.enums.Status;
import io.micronaut.data.annotation.AutoPopulated;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

import javax.persistence.Id;
import java.util.UUID;

@MappedEntity
public class Nozzle {

    @Id
    @AutoPopulated
    private UUID code;
    private String name;
    private Status status;
    @Relation(value = Relation.Kind.MANY_TO_ONE)
    private Tank tank;

}
