package se.lexicon.g46emailsenderapi.service;

import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOForm;
import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOView;

import java.util.List;

public interface EmailService {

  void sendEmail(EmailDTOForm dto);
  List<EmailDTOView> getAll();

}
