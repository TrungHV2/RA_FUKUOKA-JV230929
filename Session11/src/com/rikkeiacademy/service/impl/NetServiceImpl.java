package com.rikkeiacademy.service.impl;

import com.rikkeiacademy.model.Computer;
import com.rikkeiacademy.service.NetService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NetServiceImpl implements NetService {
    private static List<Computer> computers = new ArrayList<>();

    @Override
    public List<Computer> findAll() {
        return computers;
    }

    @Override
    public Computer findId(String id) {
        return computers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Computer> where(Predicate<Computer> predicate) {
        return computers.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public Computer singleOrDefault(Predicate<Computer> predicate) {
        return computers.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Computer pc) {
        computers.add(pc);
    }

    @Override
    public void onComputer(String pcNo) {
        Computer pc = findId(pcNo);
        if (pc == null) {
            System.out.println("Máy " + pcNo + " không tồn tại!");
        } else if (pc.isStatus()) {
            System.out.println("Máy " + pcNo + " đang sử dụng!");
        } else {
            pc.on();
        }
    }

    @Override
    public double offComputer(String pcNo) {
        Computer pc = findId(pcNo);
        if (pc == null) {
            System.out.println("Máy " + pcNo + " không tồn tại!");
        } else if (!pc.isStatus()) {
            System.out.println("Máy " + pcNo + " chưa sử dụng!");
        } else {
            return pc.pay();
        }
        return 0;
    }
}
