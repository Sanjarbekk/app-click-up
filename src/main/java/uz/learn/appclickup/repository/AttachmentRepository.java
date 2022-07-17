package uz.learn.appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.appclickup.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}