
package com.contactmanager.firstspring.Service;

import com.contactmanager.firstspring.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact saveContact(Contact contact);

    List<Contact> getAllContacts();

    Contact getContactById(Long id);

    void deleteContact(Long id);
}