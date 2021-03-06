package uz.learn.appclickup.payload;

import lombok.Data;
import uz.learn.appclickup.entity.enums.AddType;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class MemberDTO {
    private UUID id;

    private UUID roleId;

    private String fullName;

    private String email;

    private String roleName;

    private Timestamp lastActive;



    private AddType addType;//ADD, EDIT, REMOVE
}