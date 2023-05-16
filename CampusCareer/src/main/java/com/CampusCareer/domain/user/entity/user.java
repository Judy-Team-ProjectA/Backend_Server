package com.CampusCareer.domain.user.entity;

import com.CampusCareer.global.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user")
public class user extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", columnDefinition="BINARY(16)")
    private UUID uuid;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 45)
    private String password;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name="age", length = 11)
    private int age;

    @Column(name="career", length = 11)
    private int career;

    @Column(name = "sbd", length = 11)
    private float sbd;

    @Column(name = "gym", length = 255)
    private String gym;

    @Column(name = "time")
    private LocalDateTime time;

    

    public enum Gender {
        MALE, FEMALE
    }


}
