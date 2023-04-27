package spring.task_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.task_management.entity.enums.Permissions;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private WorkspaceRole workspaceRole;

    @Enumerated(value = EnumType.STRING)
    private Permissions permissions;
}
