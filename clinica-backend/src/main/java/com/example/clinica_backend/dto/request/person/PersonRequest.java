<<<<<<<< HEAD:clinica-backend/src/main/java/com/example/clinica_backend/model/dto/request/person/PersonRequest.java
package com.example.clinica_backend.model.dto.request.person;
========
package com.example.clinica_backend.dto.request.person;

import java.time.LocalDate;
>>>>>>>> dev:clinica-backend/src/main/java/com/example/clinica_backend/dto/request/person/PersonRequest.java

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonRequest {

    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate birthDay;
    private String phoneNumber;
    private String address;
    private String email;

}
