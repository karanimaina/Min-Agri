package com.example.jwtauthorization.model.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RefreshToken {
    @Column(name = "token_id")
    @Id
    String tokenid;
    @Column(name = "token", columnDefinition = "BYTEA")//@Lob
    String token;
    @Column(name = "authentication", columnDefinition = "BYTEA")//@Lob
    String authentication;
}
