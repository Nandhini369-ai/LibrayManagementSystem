package com.Nandhini.LibrayManagementSystem.Service;

import com.Nandhini.LibrayManagementSystem.DAO.MembersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service
public class MomberService {
    private MembersDAO membersDAO;// Instance of MembersDAO

    @Autowired
    public void MembersService(MembersDAO membersDAO) {
        this.membersDAO = membersDAO; // Constructor to inject the MembersDAO
    }

    public Member addMember(Member member) {
        return membersDAO.addMember(member); // Add a member
    }

    public Member updateMember(Member member) {
        return membersDAO.updateMember(member); // Update a member
    }

    public Member getMember(String memberId) {
        return membersDAO.getMember(memberId); // Correct method call
    }

    public Member removeMember(String memberId) {
        return membersDAO.removeMember(memberId); // Correct method call
    }

    public List<Member> getAllMembers() {
        return membersDAO.getAllMembers(); // Assuming you have this method in your DAO

    }

    public Member getMomberById(Long id) {
        return membersDAO.getMemberById(id); // Assuming you have this method in your DAO
    }
}
