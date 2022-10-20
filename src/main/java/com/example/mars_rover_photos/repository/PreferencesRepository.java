package com.example.mars_rover_photos.repository;

import com.example.mars_rover_photos.dto.HomeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferencesRepository  extends JpaRepository<HomeDto, Long> {

    HomeDto findByUserId(Long userId);
}
