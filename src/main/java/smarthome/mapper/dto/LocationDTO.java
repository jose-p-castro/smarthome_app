package smarthome.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/**
 * Represents a Data Transfer Object (DTO) for a location.
 * This DTO is used to transfer location information between different layers of the application.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class LocationDTO extends RepresentationModel<LocationDTO> {

    private String
            door,
            street,
            city,
            country,
            postalCode;
    private double
            latitude,
            longitude;
}
