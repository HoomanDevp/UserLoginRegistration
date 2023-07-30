package ir.dpi.userloginregistration.email;

public interface EmailSender {
    void send(String to, String email);
}