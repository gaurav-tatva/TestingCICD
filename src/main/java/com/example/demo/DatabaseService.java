package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private DatabaseRepository databaseRepository;

    public List<String> getTables() {
        return databaseRepository.getAllTables();
    }
}
