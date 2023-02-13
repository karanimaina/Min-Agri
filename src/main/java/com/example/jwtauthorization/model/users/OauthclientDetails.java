package com.example.jwtauthorization.model.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OauthclientDetails implements Serializable {
    @Id
    @Column(name = "client_id")
    String clientId;
    @Column(name = "resource_ids")
    String resourceIds;
    @Column(name = "client_secret")
    String clientSecret;
    String scope;
    @Column(name = "authorized_grant_types")
    String authorizedGrantTypes;
    @Column(name = "web_server_redirect_uri")
    String webServerRedirectUri;
    String authorities;
    @Column(name = "access_token_validity")
    int accessTokenValidity;
    @Column(name = "refresh_token_validity")
    int refreshTokenValidity;
    @Column(name = "additional_information")
    String additionalInformation;
    String autoapprove;

}
