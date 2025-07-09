package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.DesktopDTO;

import java.util.Collection;

@FunctionalInterface
public interface DesktopRepository {

    Collection<DesktopDTO> findAll();
}
