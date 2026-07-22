package org.sultan.many_2_many_mapping.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee") // lowercase
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", length = 25) // ✅ Database Column: first_name
    private String firstName;

    @Column(name = "last_name", length = 25)  // ✅ Database Column: last_name
    private String lastName;

    private int salary;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "employee_skill", // ✅ lower_case table name
            joinColumns = @JoinColumn(name = "EmpId"), // ✅ Sahi mapping columns
            inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private List<Skills> skills = new ArrayList<>();

    // Default
    public Employee() {}

    // Parametrized
    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public List<Skills> getSkills() { return skills; }
    public void setSkills(List<Skills> skills) { this.skills = skills; }
}