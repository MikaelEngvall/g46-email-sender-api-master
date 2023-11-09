package se.lexicon.g46emailsenderapi.converter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOView;
import se.lexicon.g46emailsenderapi.domain.entity.Email;

@Repository
public interface EmailConverter {

    EmailDTOView toEmailDTOView(Email entity);

//    Email toEmailEntity(EmailDTOView dtoView);
}
