package com.ProyekInformatika.TrainManager.Repository.User;

import java.util.Optional;

import com.ProyekInformatika.TrainManager.Model.User.ERole;
import com.ProyekInformatika.TrainManager.Model.User.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}