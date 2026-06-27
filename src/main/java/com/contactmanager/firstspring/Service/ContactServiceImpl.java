
package com.contactmanager.firstspring.Service;

import com.contactmanager.firstspring.entity.Contact;
import com.contactmanager.firstspring.Repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl
        implements ContactService {

    private final ContactRepository repository;

    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contact saveContact(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}
