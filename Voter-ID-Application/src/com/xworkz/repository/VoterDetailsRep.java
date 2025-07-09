package com.xworkz.repository;

import com.xworkz.things.VoterIDdetails;

public interface  VoterDetailsRep {

    boolean saveDetails(VoterIDdetails voterIDdetails);
    boolean searchVoter(long voterContactNumber);
    boolean updateVoter(long voterAadhar, VoterIDdetails newVoter);
    boolean deleteVoter(long voterContactNumber);

}
