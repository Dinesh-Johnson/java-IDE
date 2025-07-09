package com.xworkz.repository;

import com.xworkz.exception.DeleteExcep;
import com.xworkz.exception.VoterSaveException;
import com.xworkz.exception.VoterSerachExcption;
import com.xworkz.exception.VoterUpdateException;
import com.xworkz.things.VoterIDdetails;

public class VoterDetailsImpl implements VoterDetailsRep{

    VoterIDdetails[] voters= new VoterIDdetails[4];
    int index =0;

    @Override
    public boolean saveDetails(VoterIDdetails voterIDdetails) {
        if (index<voters.length){
            voters[index]=voterIDdetails;
            System.out.println("Voter Details "+index +" Saved");
            index++;
            return true;
        } else {
            throw new VoterSaveException("Storage is Full");
        }
    }

    @Override
    public boolean searchVoter(long voterContactNumber) {
        for (int i = 0; i < index; i++) {
            if (voters[i].getContactNumber() == voterContactNumber) {
                System.out.println(voters[i]);
                return true;
            } else {

                throw new VoterSerachExcption("Voter Details Not Found");
            }
        }
        return false;
    }

    @Override
    public boolean updateVoter(long voterAadhar, VoterIDdetails newVoter) {
        for (int i = 0; i <index ; i++) {
            if (voters[i].getAadharCard()==voterAadhar) {
                voters[i]=newVoter;
                return true;
            }else {
                throw new VoterUpdateException("Not Updated");
            }
        }
        return false;
    }

    @Override
    public boolean deleteVoter(long voterContactNumber) {
        for (int i = 0; i < index; i++) {
            if (voters[i].getContactNumber()== voterContactNumber){
                voters[i]=null;
                System.out.println("Voter details are Deleted");
                return true;
            }else{
                throw new DeleteExcep("Voter Details is Not Deleted");
            }
        }
        return false;
    }
}
