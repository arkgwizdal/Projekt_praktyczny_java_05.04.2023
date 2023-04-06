package org.financeMennager.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name ="expenses")
@NoArgsConstructor
@Getter
@Setter
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sum")
    private Double sum;

    @ManyToOne
    @JoinColumn(name ="cattegory_id")
    private Category category;

    @Column(name = "add_data")
    private Date data;

    @Column(name = "opperation_comment")
    private String comment;
}
