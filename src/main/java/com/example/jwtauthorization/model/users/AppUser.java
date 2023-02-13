package com.example.jwtauthorization.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    @Column(columnDefinition = "VARCHAR(1024)")
    private String password;
    private String email;
    private String phonenumber;
    private long  userid;
    private Date dateofbirth;
    private String gender;
    private String nationality;
    private String nationalidnumber;

    private boolean active;
    @CreationTimestamp
    private Date registrationdate;
    private Long organizationid;
    private int attempts;
    String otp;
    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    boolean validotp;
    Date otpexpirytime;

    private String createdby;

}

