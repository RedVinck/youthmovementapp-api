package be.tandro.youthmovementapp.api.db;

import be.tandro.youthmovementapp.api.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
