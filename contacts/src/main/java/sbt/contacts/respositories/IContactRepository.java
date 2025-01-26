package sbt.contacts.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sbt.contacts.models.Contact;

public interface IContactRepository extends JpaRepository<Contact, Integer> {}
