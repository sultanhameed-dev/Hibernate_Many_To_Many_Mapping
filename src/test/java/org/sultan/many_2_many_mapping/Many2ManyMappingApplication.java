package org.sultan.many_2_many_mapping;

import org.sultan.many_2_many_mapping.model.Employee;
import org.sultan.many_2_many_mapping.model.Skills;
import org.sultan.many_2_many_mapping.repository.EmployeeRepository;
import org.sultan.many_2_many_mapping.repository.SkillsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Many2ManyMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Many2ManyMappingApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository empRepository, SkillsRepository skillRepository) {
        return args -> {
            try {
                System.out.println("🚀 Saving Many-to-Many Relational Data...");

                // 1. Skills banayein aur save karein
                Skills java = new Skills("Java");
                Skills springBoot = new Skills("Spring Boot");
                Skills sql = new Skills("SQL");

                skillRepository.save(java);
                skillRepository.save(springBoot);
                skillRepository.save(sql);

                // 2. Employees banayein
                Employee emp1 = new Employee("Sultan", "Hameed", 95000);
                Employee emp2 = new Employee("Abdul", "Hameed", 85000);

                // 3. Link karein
                emp1.getSkills().add(java);
                emp1.getSkills().add(springBoot);

                emp2.getSkills().add(springBoot);
                emp2.getSkills().add(sql);

                // 4. Save Employees (Isi step mein error aa raha hai!)
                empRepository.save(emp1);
                empRepository.save(emp2);

                System.out.println("🎉 SUCCESS! Data saved to database.");
            } catch (Exception e) {
                System.out.println("❌ ERROR OCCURRED WHILE SAVING DATA:");
                e.printStackTrace(); // Yeh line error ka exact kaaran print karegi!
            }
        };
    }
}