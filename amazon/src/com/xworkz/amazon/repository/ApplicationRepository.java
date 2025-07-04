package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.ApplicationDTO;
import javafx.application.Application;

import java.util.List;

public interface ApplicationRepository {

    List<ApplicationDTO> findAll();
}