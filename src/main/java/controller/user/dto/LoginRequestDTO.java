package controller.user.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class LoginRequestDTO {
    @Length(min=2, max=8, message="")
    private String account;
    @NotNull()
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}