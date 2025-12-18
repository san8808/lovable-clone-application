package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codecomet.projects.lovable_clone.dto.member.MemberResponse;
import com.codecomet.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.codecomet.projects.lovable_clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, InviteMemberRequest request) {
        return null;
    }
}
