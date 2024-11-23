package com.Nandhini.LibrayManagementSystem.DAO;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MembersDAOImpl implements MembersDAO {
    private final List<Member> members = new ArrayList<>(); // In-memory storage

    @Override
    public Member addMember(Member member) {
        members.add(member);
        return member; // Return the added member
    }

    @Override
    public Member updateMember(Member member) {
        // Find the member by ID and update it
        Optional<Member> existingMember = members.stream()
                .findFirst();

        if (existingMember.isPresent()) {
            members.remove(existingMember.get());
            members.add(member);
            return member; // Return the updated member
        }

        return null; // Return null if the member was not found
    }

    @Override
    public Member getMemberById(Long id) {
        return members.stream()
                .findFirst()
                .orElse(null); // Return the member if found, otherwise null
    }

    @Override
    public List<Member> getAllMembers() {
        return new ArrayList<>(members); // Return a copy of the members list
    }

    @Override
    public Member getMember(String memberId) {
        // Assuming memberId is a String representation of the ID
        return members.stream()
                .findFirst()
                .orElse(null); // Return the member if found, otherwise null
    }

    @Override
    public Member removeMember(String memberId) {
        // Find the member to remove by memberId
        Optional<Member> memberToRemove = members.stream()
                .findFirst();

        if (memberToRemove.isPresent()) {
            members.remove(memberToRemove.get());
            return memberToRemove.get(); // Return the removed member
        }

        return null; // Return null if the member was not found
    }
}
