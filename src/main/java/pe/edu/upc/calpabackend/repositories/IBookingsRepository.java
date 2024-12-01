package pe.edu.upc.calpabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.calpabackend.entities.Bookings;

@Repository
public interface IBookingsRepository extends JpaRepository<Bookings, Integer> {
}
