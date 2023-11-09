package se.lexicon.g46emailsenderapi.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter

public class ErrorDTO {

  private Integer errorCode;
  private String errorMessage;
  private LocalDateTime dateTime = LocalDateTime.now();

  public ErrorDTO(Integer errorCode, String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }
}
