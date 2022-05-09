package co.edu.cue.login.controller;

import co.edu.cue.login.model.LoginRequest;
import co.edu.cue.login.model.LoginResponse;
import co.edu.cue.login.service.UserService;
import co.edu.cue.login.utility.LoginUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private LoginUtility loginUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Welcome to Daily Code Buffer!!";
    }


    @PostMapping("/authenticate")
    public LoginResponse authenticate(@RequestBody LoginRequest loginRequest) throws Exception{

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

        final UserDetails userDetails
                = userService.loadUserByUsername(loginRequest.getUsername());

        final String token =
                loginUtility.generateToken(userDetails);

        return  new LoginResponse(token);
    }
}
