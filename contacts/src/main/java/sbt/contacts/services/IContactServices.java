package sbt.contacts.services;

import sbt.contacts.models.Contact;

import java.util.List;

public interface IContactServices {
    public List<Contact> listContacts();

    public Contact getContactById(Integer idContact);

    public void saveOrUpdateContact(Contact contact);

    public void deleteContact(Contact contact);
}
