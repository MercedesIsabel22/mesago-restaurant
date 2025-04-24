package com.mesago.mesago.controller;

import com.mesago.mesago.dto.login.LoginRequestDto;
import com.mesago.mesago.dto.login.LoginResponseDto;
import com.mesago.mesago.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto request) {
        LoginResponseDto response = service.login(request);
        return ResponseEntity.ok(response);
    }

}
