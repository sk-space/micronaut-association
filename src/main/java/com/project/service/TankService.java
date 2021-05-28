package com.project.service;

import com.project.domain.Tank;

public interface TankService {

    Iterable<Tank> getAll();

    Tank saveTank(Tank tank);

}
