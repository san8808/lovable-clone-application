package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codecomet.projects.lovable_clone.dto.member.MemberResponse;
import com.codecomet.projects.lovable_clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
     List<MemberResponse> getProjectMembers(Long projectId, Long userId);

     MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

     MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request);

     MemberResponse deleteProjectMember(Long projectId, Long memberId, InviteMemberRequest request);
}
