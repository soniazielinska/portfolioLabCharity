package pl.coderslab.charity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "institutions")
public class Institution {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "name", length = 100, nullable = false)
        private String name;
        @Column(name = "description", length = 1000, nullable = false)
        private String description;
}
