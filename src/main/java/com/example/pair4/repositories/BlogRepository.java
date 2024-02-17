package com.example.pair4.repositories;

import com.example.pair4.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    // Başlığa göre blog gönderilerini bulmak için bir metod
    List<Blog> findAllByTitle(String title);
}
