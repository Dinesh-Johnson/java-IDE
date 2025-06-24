package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.TelevisionDTO;

import java.util.Collection;

public interface TelevisionRepository {


    Collection<TelevisionDTO> showAll();
}
