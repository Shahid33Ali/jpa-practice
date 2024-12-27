package com.albouspringdatajpa.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "Author_Table")
public class Author extends BaseEntity{
//    @Id
//    @GeneratedValue
////    @TableGenerator(name="author_id_gen",table = "id_generator",pkColumnName = "id_name",valueColumnName = "id_value",allocationSize = 1)
//    private Integer id;
@Column(name = "f_name")
    private String firstName;
@Column(name = "l_name")
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(updatable = false,nullable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private LocalDateTime modifiedAt;
    private int age;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
