package com.Nandhini.LibrayManagementSystem.DAO;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;


public interface MembersDAO {
    Member addMember(Member member);
    Member updateMember(Member member);
    Member getMemberById(Long id); // Use this method for ID lookup
    List<Member> getAllMembers();

    Member getMember(String memberId); // Correct name
    Member removeMember(String memberId); // Correct name
}

