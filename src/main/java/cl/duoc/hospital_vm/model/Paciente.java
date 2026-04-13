package cl.duoc.hospital_vm.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Paciente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique=true, nullable=false)
    private Integer numrun;

    @Column (length = 1, nullable = false)
    private String dvrun; 

    @Column (nullable = false , length = 50)
    private String pnombre;

    @Column(nullable = true , length = 50)
    private String snombre;

    @Column (nullable = false, length = 50)
    private String appaterno;

    @Column (nullable =false, length = 50)
    private String apmaterno;

    @Column (nullable = true)
    private Date fechanacimiento;

    @Column(nullable = false, unique = true , length = 40)
    private String correo;
}
