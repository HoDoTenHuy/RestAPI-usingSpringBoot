package com.example.easynotes.service;

import com.example.easynotes.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactService extends JpaRepository<Contact, Long> {
}
