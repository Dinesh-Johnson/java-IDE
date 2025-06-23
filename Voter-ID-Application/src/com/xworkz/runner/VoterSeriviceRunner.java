package com.xworkz.runner;

import com.xworkz.repository.VoterDetailsImpl;
import com.xworkz.repository.VoterDetailsRep;
import com.xworkz.things.VoterIDdetails;

public class VoterSeriviceRunner {
    public static void main(String[] args) {

        VoterDetailsRep voterDetailsRep=new VoterDetailsImpl();
        VoterIDdetails voter1 = new VoterIDdetails();
        voter1.setName("Dinesh");
        voter1.setAge(28);
        voter1.setContactNumber(987654321);
        voter1.setEmail("danealdinesh@gmail.com");
        voter1.setAadharCard(427654321);
        voter1.setCity("Bangalore");
        voter1.setState("Karnataka");
        voter1.setCountry("India");
        voter1.setAddress("BTM 1st Layout");
        voter1.setFatherName("Johnson");
        voterDetailsRep.saveDetails(voter1);

        VoterIDdetails voter2 = new VoterIDdetails();
        voter2.setName("Vinoda");
        voter2.setAge(27);
        voter2.setContactNumber(987654123);
        voter2.setEmail("vinoda.xworkz@gmail.com");
        voter2.setAadharCard(427654322);
        voter2.setCity("Bangalore");
        voter2.setState("Karnataka");
        voter2.setCountry("India");
        voter2.setAddress("BTM 1st Layout");
        voter2.setFatherName("Father");
        voterDetailsRep.saveDetails(voter2);

        VoterIDdetails voter3= new VoterIDdetails();
        voter3.setName("Daneal");
        voter3.setAge(28);
        voter3.setContactNumber(987654320);
        voter3.setEmail("danealdinesh@gmail.com");
        voter3.setAadharCard(427654323);
        voter3.setCity("Bangalore");
        voter3.setState("Karnataka");
        voter3.setCountry("India");
        voter3.setAddress("BTM 1st Layout");
        voter3.setFatherName("Johnson");
        voterDetailsRep.saveDetails(voter3);

        voterDetailsRep.searchVoter(987654321l);
        System.out.println();
        //voterDetailsRep.updateVoter(427654322l,voter2);
        voterDetailsRep.deleteVoter(987654321);
        voterDetailsRep.searchVoter(987654321l);
    }
}
