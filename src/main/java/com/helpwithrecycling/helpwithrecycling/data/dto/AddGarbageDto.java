package com.helpwithrecycling.helpwithrecycling.data.dto;

import org.springframework.web.multipart.MultipartFile;
// varor
public record AddGarbageDto
        (
                String name ,
                int weight ,
                long customerId ,
                int lat ,
                int lng ,
                String address ,
                long price ,
                int size ,
                MultipartFile image
        ) {
}
