package com.example.AOD.movie.CGV.repository;

import com.example.AOD.movie.CGV.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    boolean existsByExternalId(String externalId);
    Movie findByExternalId(String externalId);
}