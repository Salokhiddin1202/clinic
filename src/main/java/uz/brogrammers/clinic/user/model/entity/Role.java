package uz.brogrammers.clinic.user.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.brogrammers.clinic.user.model.enums.RoleName;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @CreatedDate
    @Column(name = "created")
    private ZonedDateTime created;

    @LastModifiedDate
    @Column(name = "updated")
    private ZonedDateTime updated;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name = "name")
    private RoleName name;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles=new HashSet<>();

    @Column(name = "phone",nullable = false)
    private String phone;

    @Column(name = "department_id",nullable = false)
    private Long departmentId;





}
