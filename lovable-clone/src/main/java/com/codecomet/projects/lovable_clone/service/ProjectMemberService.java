package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codecomet.projects.lovable_clone.dto.member.MemberResponse;
import com.codecomet.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectMemberService {
     List<MemberResponse> getProjectMembers(Long projectId);

     MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

     MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

     void removeProjectMember(Long projectId, Long memberId);
}
