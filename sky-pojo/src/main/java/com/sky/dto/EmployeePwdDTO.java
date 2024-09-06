package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePwdDTO implements Serializable {

    private Long id;

    private String oldPassword;

    private String newPassword;
}
