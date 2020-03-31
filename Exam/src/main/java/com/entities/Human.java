package com.entities;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@ToString(exclude = "Virus")
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "HUMAN")
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "VIRUS_NAME", nullable = false)
    @JoinColumn(name = "MEDICINE_NAME ", nullable = false)

    private Set<Virus> virus;
    private Set<Medicine> medicine;


    public Human() {
    }
}
