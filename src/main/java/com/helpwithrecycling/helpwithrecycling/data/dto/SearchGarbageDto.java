package com.helpwithrecycling.helpwithrecycling.data.dto;

import org.springframework.web.multipart.MultipartFile;
//söka varor
public record SearchGarbageDto
        (
                long id ,
                String name ,
                int weight ,
                long customerId ,
                long driverId ,
                int lat ,
                int lng
        ) {
}
