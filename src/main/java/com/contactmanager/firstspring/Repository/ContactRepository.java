
package com.contactmanager.firstspring.Repository;

import com.contactmanager.firstspring.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository
        extends JpaRepository<Contact, Long> {
}
