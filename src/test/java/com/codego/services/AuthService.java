package com.codego.services;

import com.codego.dto.SignupRequest;

public interface AuthService {

	boolean createCustomer(SignupRequest signupRequest);

}
