package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codecomet.projects.lovable_clone.dto.member.MemberResponse;
import com.codecomet.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.codecomet.projects.lovable_clone.entity.ProjectMember;
import org.hibernate.sql.Update;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectMemberService {
     List<MemberResponse> getProjectMembers(Long projectId, Long userId);

     MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

     MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

     MemberResponse deleteProjectMember(Long projectId, Long memberId, InviteMemberRequest request);
}
