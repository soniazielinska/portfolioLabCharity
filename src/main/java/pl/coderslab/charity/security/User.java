package pl.coderslab.charity.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import pl.coderslab.charity.donation.Donation;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String password;
    @OneToMany
    private List<Donation> donations;
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
    }

    public User() {
    }
}
