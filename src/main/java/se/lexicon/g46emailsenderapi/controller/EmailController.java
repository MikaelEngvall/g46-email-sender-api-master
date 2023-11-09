package se.lexicon.g46emailsenderapi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOForm;
import se.lexicon.g46emailsenderapi.domain.dto.EmailDTOView;
import se.lexicon.g46emailsenderapi.service.EmailServiceImpl;

import java.util.List;

@RequestMapping("/api/v1/email")
@RestController
public class EmailController {

  private final EmailServiceImpl emailService;

  @Autowired
  public EmailController(EmailServiceImpl emailService) {
    this.emailService = emailService;
  }

  @PostMapping
  public ResponseEntity<Void> doSendEmail(@RequestBody @Valid EmailDTOForm dto) {
//    System.out.println("DTO:" + dto);
    emailService.sendEmail(dto);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/getall")
  public ResponseEntity<List<EmailDTOView>> doGetAll() {

    List<EmailDTOView> responseBody = emailService.getAll();
      return ResponseEntity.ok().body(responseBody);
  }

}
