package uz.learn.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.learn.appclickup.entity.enums.WorkspacePermissionName;
import uz.learn.appclickup.entity.template.AbsLongEntity;
import uz.learn.appclickup.entity.template.AbsUUIDEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;
}
