package org.sultan.many_2_many_mapping.repository;

import org.sultan.many_2_many_mapping.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {
    // Yahan pehle generic type me 'Skills' hona chahiye, 'Employee' nahi!
}