package uz.learn.appclickup.service;

import uz.learn.appclickup.entity.User;
import uz.learn.appclickup.payload.ApiResponse;
import uz.learn.appclickup.payload.MemberDTO;
import uz.learn.appclickup.payload.WorkspaceDTO;

import java.util.List;
import java.util.UUID;


public interface WorkspaceService {

    ApiResponse addWorkspace(WorkspaceDTO workspaceDTO, User user);

    ApiResponse editWorkspace(WorkspaceDTO workspaceDTO);

    ApiResponse changeOwnerWorkspace(Long id, UUID ownerId);

    ApiResponse deleteWorkspace(Long id);

    ApiResponse addOrEditOrRemoveWorkspace(Long id, MemberDTO memberDTO);

    ApiResponse joinToWorkspace(Long id, User user);

    List<MemberDTO> getMemberAndGuest(Long id);
}
