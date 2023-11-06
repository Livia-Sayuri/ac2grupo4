package prog.dist.api.model;

public class User {
    private String login;
    private String password;
    private String name;
    private String lastname;
    private String dataNascimento;
    private String cpf;
    private Integer userId = null;
    public User() {}
    public User(String login, String password, String name, String lastname, String dataNascimento, String cpf, Integer userId) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}