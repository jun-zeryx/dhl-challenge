package com.dhl.challenge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostcodeDTO {
    String fromPostcode;
    String toPostcode;
}
