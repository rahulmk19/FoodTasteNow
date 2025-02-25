package com.foodtaste.dto;

import com.foodtaste.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private String uuid;

	@NotBlank
	@Size(min = 3, message = "Name should be greater than 3 characters")
	private String name;

	@Email(message = "Invalid email format")
	@NotBlank
	private String email;

	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits long")
	private String mobileNumber;

	private Role role;
}
