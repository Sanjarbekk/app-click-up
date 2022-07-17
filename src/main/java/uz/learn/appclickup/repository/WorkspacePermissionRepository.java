package uz.learn.appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.appclickup.entity.WorkspacePermission;

import java.util.UUID;

public interface WorkspacePermissionRepository extends JpaRepository<WorkspacePermission, UUID> {
}