package com.example.validate_register.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Không được để trống")
    @Size(min = 5, max = 45,message = "ít nhất 5 đến 45 kí tự")
    private String fistname;
    @NotBlank(message = "Không được để trống")
    @Size(min = 5, max = 45,message = "ít nhất 5 đến 45 kí tự")
    private String lastname;
    @Pattern(regexp ="^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$",message = "Không phải số điện thoại")
    private String numberphone;
    @Min(value = 18,message = "vui lòng nhập tuổi 18 tuổi tỏ lên")
    private int age;
    @Email(message = "Định dạng không chính xác")
    private String email;
}
