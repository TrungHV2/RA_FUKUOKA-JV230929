package com.rikkeiacademy.service;

import com.rikkeiacademy.model.Computer;

import java.util.List;
import java.util.function.Predicate;

public interface NetService {
    List<Computer> findAll();
    Computer findId(String id);
    List<Computer> where(Predicate<Computer> predicate);
    Computer singleOrDefault(Predicate<Computer> predicate);
    void add(Computer pc);
    void onComputer(String pcNo);
    double offComputer(String pcNo);
}
