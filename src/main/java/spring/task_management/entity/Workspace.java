package spring.task_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.task_management.entity.template.AbsEntity;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Workspace extends AbsEntity {

    @Column(nullable = false)
    private String name;
    private String color;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Users owner;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne
    private Attachment avatarId;

}
