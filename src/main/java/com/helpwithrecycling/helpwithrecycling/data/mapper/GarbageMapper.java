package com.helpwithrecycling.helpwithrecycling.data.mapper;

import com.helpwithrecycling.helpwithrecycling.data.dto.AcceptGarbageDto;
import com.helpwithrecycling.helpwithrecycling.data.dto.AddGarbageDto;
import com.helpwithrecycling.helpwithrecycling.data.dto.SearchGarbageDto;
import com.helpwithrecycling.helpwithrecycling.data.entity.Garbage;
import com.helpwithrecycling.helpwithrecycling.data.entity.Users;

public final class GarbageMapper {

    private GarbageMapper() {
    }


    public static Garbage toGarbage(final AddGarbageDto addGarbageDto) {
        if (addGarbageDto != null) {
            try {
                final Garbage garbage = new Garbage();
                garbage.setName(addGarbageDto.name());
                garbage.setAddress(addGarbageDto.address());

                final Users customer = new Users();
                customer.setId(addGarbageDto.customerId());
                garbage.setCustomer(customer);

                garbage.setPrice(addGarbageDto.price());
                garbage.setSize(addGarbageDto.size());
                garbage.setLat(addGarbageDto.lat());
                garbage.setLng(addGarbageDto.lng());
                garbage.setWeight(addGarbageDto.weight());
                garbage.setImage(addGarbageDto.image().getBytes());

                return garbage;
            } catch (Exception e) {
                System.out.println("Fail to add dto to garbage: " + e.getMessage());
            }
        }

        return null;
    }

    public static Garbage toGarbage(final SearchGarbageDto searchGarbageDto) {
        if (searchGarbageDto != null) {
            try {
                final Garbage garbage = new Garbage();
                garbage.setName(searchGarbageDto.name());

                final Users customer = new Users();
                customer.setId(searchGarbageDto.customerId());
                garbage.setCustomer(customer);

                garbage.setLat(searchGarbageDto.lat());
                garbage.setLng(searchGarbageDto.lng());
                garbage.setWeight(searchGarbageDto.weight());

                return garbage;
            } catch (Exception e) {
                System.out.println("Fail to search dto to garbage: " + e.getMessage());
            }
        }

        return null;
    }

    public static Garbage toGarbage(final AcceptGarbageDto acceptGarbageDto) {
        if (acceptGarbageDto != null) {
            try {
                final Garbage garbage = new Garbage();
                final Users driver = new Users();
                driver.setId(acceptGarbageDto.driverId());
                garbage.setDriver(driver);

                return garbage;

            } catch (Exception e) {
                System.out.println("Fail to accept dto to garbage: " + e.getMessage());
            }
        }

        return null;
    }

}
