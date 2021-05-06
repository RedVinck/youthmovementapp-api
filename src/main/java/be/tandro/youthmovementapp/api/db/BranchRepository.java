package be.tandro.youthmovementapp.api.db;

import be.tandro.youthmovementapp.api.model.Branch;
import be.tandro.youthmovementapp.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {

}
