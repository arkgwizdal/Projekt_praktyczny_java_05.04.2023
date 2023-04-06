package org.financeMennager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name ="income")
@NoArgsConstructor
@Getter
@Setter
public class Incoms {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sum")
    private Double sum;

    @Column(name = "add_data")
    private Date dateIncome;

    @Column(name = "oppertation_comment")
    private String comment;



}
