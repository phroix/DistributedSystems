package de.esslingen.DistributedSystems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.esslingen.DistributedSystems.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByName(String name);
}
