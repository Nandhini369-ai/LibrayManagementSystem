package com.Nandhini.LibrayManagementSystem.Controller;

import com.Nandhini.LibrayManagementSystem.Service.MomberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MembersController { // Corrected class name
    private final MomberService membersService; // Correct service naming

    @Autowired
    public MembersController(MomberService membersService) { // Constructor injection
        this.membersService = membersService;
    }

    @PostMapping("/add")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        Member addedMember = membersService.addMember(member);
        return ResponseEntity.ok(addedMember); // Return the added member
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> members = membersService.getAllMembers();
        return ResponseEntity.ok(members); // Return the list of members
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long id) {
        Member member = membersService.getMomberById(id);
        return ResponseEntity.ok(member); // Return the found member
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member member) {
        member.getModifiers(); // Assuming Member has an ID field
        Member updatedMember = membersService.updateMember(member);
        return ResponseEntity.ok(updatedMember); // Return the updated member
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
        membersService.removeMember(String.valueOf(id));
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }
}
