package uz.brogrammers.clinic.user.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import uz.brogrammers.clinic.department.model.entity.Department;

import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class ApiResponse {

    private boolean success;
    private String messege;
    private Object data;


}
