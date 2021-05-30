package be.tandro.youthmovementapp.api.db;

import be.tandro.youthmovementapp.api.model.Balance;
import be.tandro.youthmovementapp.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
