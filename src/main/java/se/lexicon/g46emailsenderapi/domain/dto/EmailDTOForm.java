package se.lexicon.g46emailsenderapi.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class EmailDTOForm {
    @NotBlank(message = "To fields cannot be blank")
    @Email(message = "To field must be a valid email address")
    private String to;

    @NotBlank(message = "Subject field cannot be blank")
    private String subject;

    @NotBlank(message = "HTML field cannot be blank")
    private String html;

    @Positive(message = "Type should be a positive number")
    private Integer type;

    // add more fields
}
