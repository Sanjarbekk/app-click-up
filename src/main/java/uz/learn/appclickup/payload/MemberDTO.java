package uz.learn.appclickup.payload;

import lombok.Data;
import uz.learn.appclickup.entity.enums.AddType;

import java.util.UUID;

@Data
public class MemberDTO {
    private UUID id;

    private UUID roleId;

    private AddType addType;//ADD, EDIT, REMOVE
}