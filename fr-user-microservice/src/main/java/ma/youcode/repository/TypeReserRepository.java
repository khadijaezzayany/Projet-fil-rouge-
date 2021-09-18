package ma.youcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youcode.models.TypeReser;

@Repository
public interface TypeReserRepository extends JpaRepository<TypeReser, Long> {

	TypeReser findTypeReserById(Long id);
}
