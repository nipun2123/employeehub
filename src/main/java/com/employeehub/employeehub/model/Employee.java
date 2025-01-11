package com.employeehub.employeehub.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fName;
    private String lName;
    private String number;
    private String email;
}
