package com.eazybytes.example18.config;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;

import java.util.*;

@Controller("eazySchoolProps")
@ConfigurationProperties(prefix = "eazyschool")
@Data
@Validated
public class EazySchoolConfigProps {
    @Min(value=5, message="must be between 5 and 25")
    @Max(value=25, message="must be between 5 and 25")
    private int pageSize;
    private Map<String, String> contact;
    private List<String> branches;
}
