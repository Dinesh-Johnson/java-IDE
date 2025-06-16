package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.interfaces.ElectionService;
import com.xworkz.inerfaces.state.ElectionProp;
import com.xworkz.inerfaces.subclass.ElectionImplementation;

public class ElectonRunner {
    public static void main(String[] args) {

        ElectionService election= new ElectionImplementation();
        ElectionProp electionProp=new ElectionProp();

        electionProp.setUsername("D");
        electionProp.setAddress("Chennai");
        electionProp.setAge(28);
        electionProp.setEmail("danealdinesh@gmail.com");
        electionProp.setdOB("March 28 1997");
        electionProp.setFatherName("Johnson");
        electionProp.setMotherName("Umarani");
        electionProp.setContactNumber(9987654314l);

        election.validation(electionProp);

    }
}
