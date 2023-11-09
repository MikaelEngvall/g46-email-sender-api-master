package se.lexicon.g46emailsenderapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import se.lexicon.g46emailsenderapi.domain.entity.Email;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, String> {

}
