package com.entities;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@ToString(exclude = "Human")
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "VIRUS")
public class Virus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    private Set<Human> human;
}
