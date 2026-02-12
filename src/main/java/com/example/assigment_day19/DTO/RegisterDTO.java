package com.example.assigment_day19.DTO;

public class RegisterDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String address;
    private Integer age;

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public Integer getAge() { return age; }

    public void setId(Long id) {
        this.id = id;
    }
}
