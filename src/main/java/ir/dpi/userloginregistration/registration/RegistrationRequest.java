package ir.dpi.userloginregistration.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    public final String firstName;
    public final String lastName;
    public final String email;
    public final String password;
}
