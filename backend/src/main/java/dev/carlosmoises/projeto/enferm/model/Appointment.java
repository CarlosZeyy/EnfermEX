package dev.carlosmoises.projeto.enferm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @Column(name = "data")
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private StatusAppointment status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
