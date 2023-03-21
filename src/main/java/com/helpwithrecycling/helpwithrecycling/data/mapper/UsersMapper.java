package com.helpwithrecycling.helpwithrecycling.data.mapper;

import com.helpwithrecycling.helpwithrecycling.data.dto.LoginDto;
import com.helpwithrecycling.helpwithrecycling.data.dto.RegisterDto;
import com.helpwithrecycling.helpwithrecycling.data.dto.SearchUserDto;
import com.helpwithrecycling.helpwithrecycling.data.entity.Users;
import com.helpwithrecycling.helpwithrecycling.data.enums.UserType;

public final class UsersMapper {

    public UsersMapper() {
    }

    public static Users toUser(final RegisterDto registerDto) {

        if (registerDto != null) {

            try {
                final Users user = new Users();
                user.setLastName(registerDto.lastName());
                user.setFirstName(registerDto.firstName());
                user.setEmail(registerDto.email());
                user.setUserType(UserType.valueOf(registerDto.userType()));
                user.setPassword(registerDto.password());

                return user;

            } catch (Exception e) {
                System.out.println("Fail to register dto to user: " + e.getMessage());
            }

        }

        return null;

    }

    public static Users toUser(final SearchUserDto searchUserDto) {

        if (searchUserDto != null) {

            try {
                final Users user = new Users();
                if (searchUserDto.id() != null) user.setId(searchUserDto.id());
                if (searchUserDto.lastName() != null) user.setLastName(searchUserDto.lastName());
                if (searchUserDto.firstName() != null) user.setFirstName(searchUserDto.firstName());
                if (searchUserDto.email() != null) user.setEmail(searchUserDto.email());
                if (searchUserDto.userType() != null) user.setUserType(UserType.valueOf(searchUserDto.userType()));

                return user;

            } catch (Exception e) {
                System.out.println("Fail to search dto to user: " + e.getMessage());
            }

        }

        return null;

    }

    public static Users toUser(final LoginDto loginDto) {

        if (loginDto != null) {

            try {
                final Users user = new Users();
                user.setEmail(loginDto.email());
                user.setPassword(loginDto.password());

                return user;

            } catch (Exception e) {
                System.out.println("Fail to search dto to user: " + e.getMessage());
            }

        }

        return null;

    }
}
