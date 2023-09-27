//package ma.salah.gestion_de_stock_backend.services.auth;
//
//import ma.salah.gestion_de_stock_backend.dto.UtilisateurDto;
//import ma.salah.gestion_de_stock_backend.model.auth.ExtendedUser;
//import ma.salah.gestion_de_stock_backend.services.UtilisateurService;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ApplicationUserDetailsService implements UserDetailsService {
//
//  private UtilisateurService service;
//
//  public ApplicationUserDetailsService(UtilisateurService service) {
//    this.service = service;
//  }
//
//
//  @Override
//  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//    UtilisateurDto utilisateur = service.findByEmail(email);
//
//    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//    utilisateur.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));
//
//    return new ExtendedUser(utilisateur.getEmail(), utilisateur.getMoteDePasse(), utilisateur.getEntreprise().getId(), authorities);
//  }
//}
