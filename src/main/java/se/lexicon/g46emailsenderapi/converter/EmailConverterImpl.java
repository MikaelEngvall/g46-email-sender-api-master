package se.lexicon.g46emailsenderapi.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOView;
import se.lexicon.g46emailsenderapi.domain.entity.Email;
@Component
public class EmailConverterImpl implements EmailConverter {

    @Override
    public EmailDTOView toEmailDTOView(Email entity) {
        return EmailDTOView.builder()
                .id(entity.getId())
                .from(entity.getFrom())
                .to(entity.getTo())
                .subject(entity.getSubject())
                .content(entity.getContent())
                .dateTime(entity.getDateTime())
                .type(entity.getType())
                .build();
    }

    @Override
    public Email toEmailEntity(EmailDTOView dtoView) {
        Email.EmailBuilder taskBuilder = Email.builder()
                .id(dtoView.getId())
                .from(dtoView.getFrom())
                .to(dtoView.getTo())
                .subject(dtoView.getSubject())
                .content(dtoView.getContent())
                .dateTime(dtoView.getDateTime())
                .type(dtoView.getType());
        return taskBuilder.build();
    }
}
