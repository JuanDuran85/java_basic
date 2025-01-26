package sbt.contacts.services;

import org.springframework.stereotype.Service;
import sbt.contacts.models.Contact;
import sbt.contacts.respositories.IContactRepository;

import java.util.List;

@Service
public class ContactServices implements IContactServices {

    private final IContactRepository contactRepository;

    public ContactServices(IContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> listContacts() {
        return this.contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Integer idContact) {
        return this.contactRepository.findById(idContact).orElse(null);
    }

    @Override
    public void saveOrUpdateContact(Contact contact) {
        this.contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        this.contactRepository.delete(contact);
    }
}
