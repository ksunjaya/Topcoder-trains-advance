package com.ProyekInformatika.TrainManager.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyekInformatika.TrainManager.Model.Train;

public interface TrainRepository extends JpaRepository<Train, Long>{

}
