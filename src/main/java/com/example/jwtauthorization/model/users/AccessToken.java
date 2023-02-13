package com.example.jwtauthorization.model.users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String token_id;
    @Column(name = "token", columnDefinition = "BYTEA")// @Lob
    String token;
    @Column(name = "authentication_id")
    String authentication_id;
    @Column(name = "user_name")
    String user_name;
    @Column(name = "client_id")
    String client_id;
    @Column(name = "authentication", columnDefinition = "BYTEA")//@Lob
    String authentication;
    @Column(name = "refresh_token")
    String refresh_token;
}
