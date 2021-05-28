package com.project.service.impl;

import com.project.domain.Tank;
import com.project.repository.TankRepository;
import com.project.service.TankService;

import javax.inject.Singleton;

@Singleton
public class TankServiceImpl implements TankService {

    private final TankRepository tankRepository;

    public TankServiceImpl(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }


    @Override
    public Iterable<Tank> getAll() {
        return tankRepository.findAll();
    }

    @Override
    public Tank saveTank(Tank tank) {
        return tankRepository.save(tank);
    }
}
