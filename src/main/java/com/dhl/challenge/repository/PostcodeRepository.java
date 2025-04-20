package com.dhl.challenge.repository;

import com.dhl.challenge.model.Postcode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostcodeRepository extends JpaRepository<Postcode, Long> {
  Optional<Postcode> findByPostcode(String postcode);
}