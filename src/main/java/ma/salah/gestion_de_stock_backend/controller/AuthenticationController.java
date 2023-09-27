package ma.salah.gestion_de_stock_backend.controller;

//import ma.salah.gestion_de_stock_backend.controller.api.AuthenticationApi;
//import ma.salah.gestion_de_stock_backend.dto.auth.AuthenticationRequest;
//import ma.salah.gestion_de_stock_backend.dto.auth.AuthenticationResponse;
//import ma.salah.gestion_de_stock_backend.model.auth.ExtendedUser;
//import ma.salah.gestion_de_stock_backend.services.auth.ApplicationUserDetailsService;
//import ma.salah.gestion_de_stock_backend.utils.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AuthenticationController implements AuthenticationApi {
//
//    private AuthenticationManager authenticationManager;
//
//    private ApplicationUserDetailsService userDetailsService;
//
//    private JwtUtil jwtUtil;
//
//    public AuthenticationController(AuthenticationManager authenticationManager, ApplicationUserDetailsService userDetailsService, JwtUtil jwtUtil) {
//        this.authenticationManager = authenticationManager;
//        this.userDetailsService = userDetailsService;
//        this.jwtUtil = jwtUtil;
//    }
//
//    @Override
//    public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getLogin(),
//                        request.getPassword()
//                )
//        );
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getLogin());
//
//        final String jwt = jwtUtil.generateToken((ExtendedUser) userDetails);
//
//        return ResponseEntity.ok(AuthenticationResponse.builder().accessToken(jwt).build());
//    }
//
//}
