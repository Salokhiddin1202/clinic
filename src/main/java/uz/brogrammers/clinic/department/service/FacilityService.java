package uz.brogrammers.clinic.department.service;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.brogrammers.clinic.department.model.entity.Facility;
import uz.brogrammers.clinic.department.repository.FacilityRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FacilityService {

    private final FacilityRepository facilityRepository;

    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    public Optional<Facility> findById(@NotNull Integer id){
        return facilityRepository.findById(id);
    }

    public void deleteById(Integer id){
        facilityRepository.deleteById(id);
    }

}
