package se.lexicon.g46emailsenderapi.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmailDTOView {

private String id;
private String from;
private String to;
private String subject;
private String content;
private LocalDateTime dateTime;
private Integer type;
}
