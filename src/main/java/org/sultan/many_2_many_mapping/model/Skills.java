package org.sultan.many_2_many_mapping.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //  @Id ki jagah yahan @Entity kar diya hai
@Table(name = "Skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "skillName", length = 25)
    private String skillName;

    @ManyToMany(mappedBy = "skills")
    private List<Employee> employees = new ArrayList<>();

    // Default Constructor
    public Skills() {}

    // Parameterized Constructor
    public Skills(String skillName) {
        this.skillName = skillName;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSkillName() { return this.skillName; } //  Yahan return add kar diya hai
    public void setSkillName(String skillName) { this.skillName = skillName; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
}