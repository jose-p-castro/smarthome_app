package smarthome.mapper.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@JsonPropertyOrder({"houseID"})
public class HouseDTO extends RepresentationModel<HouseDTO> {

    private String
            houseID,
            door,
            street,
            city,
            country,
            postalCode;
    private double
            latitude,
            longitude;
}
