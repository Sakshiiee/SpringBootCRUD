package com.neosoft.SpringBootCRUDDemo.Repositories;

import com.neosoft.SpringBootCRUDDemo.Entity.Makeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeupRepository extends JpaRepository<Makeup, Integer> {
    public Makeup findById(int id);

    public void deleteById(int id);
}
