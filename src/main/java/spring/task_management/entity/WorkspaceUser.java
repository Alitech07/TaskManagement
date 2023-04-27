package spring.task_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspaceUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @ManyToOne
    private Workspace workspace;
    @OneToMany
    private List<Users> users;
    @OneToMany
    private List<WorkspaceRole> workspaceRole;
    private Date dateInvited;
    private Date dateJoined;
}
