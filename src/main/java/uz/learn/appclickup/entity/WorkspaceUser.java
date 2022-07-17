package uz.learn.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.learn.appclickup.entity.enums.WorkspaceRoleName;
import uz.learn.appclickup.entity.template.AbsLongEntity;
import uz.learn.appclickup.entity.template.AbsUUIDEntity;

import javax.persistence.*;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspaceUser extends AbsLongEntity  {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Workspace workspace;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;

    @Column(nullable = false)
    private Timestamp dateInvited;

    private Timestamp dateJoined;
}