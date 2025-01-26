package sbt.contacts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idContact;

    String name;
    String email;
    String phoneNumber;

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(idContact, contact.idContact) && Objects.equals(name, contact.name) && Objects.equals(email, contact.email) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContact, name, email, phoneNumber);
    }
}
