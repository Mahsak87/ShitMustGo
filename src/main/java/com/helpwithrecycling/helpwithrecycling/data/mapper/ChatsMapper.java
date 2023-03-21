package com.helpwithrecycling.helpwithrecycling.data.mapper;

import com.helpwithrecycling.helpwithrecycling.data.dto.GetChatsDto;
import com.helpwithrecycling.helpwithrecycling.data.dto.NewChatDto;
import com.helpwithrecycling.helpwithrecycling.data.entity.Chats;
import com.helpwithrecycling.helpwithrecycling.data.entity.Users;

public final class ChatsMapper {

    private ChatsMapper() {
    }

    public static Chats toChat(final NewChatDto newChatDto) {
        if (newChatDto != null) {
            try {
                final Chats chat = new Chats();

                final Users customer = new Users();
                customer.setId(newChatDto.customerId());
                chat.setCustomer(customer);

                final Users driver = new Users();
                driver.setId(newChatDto.driverId());
                chat.setDriver(driver);

                chat.setMessage(newChatDto.message());

                return chat;

            } catch (Exception e) {
                System.out.println("Fail to new dto to chat: " + e.getMessage());
            }
        }

        return null;
    }

    public static Chats toChat(final GetChatsDto getChatsDto) {
        if (getChatsDto != null) {
            try {
                final Chats chat = new Chats();

                final Users customer = new Users();
                customer.setId(getChatsDto.customerId());
                chat.setCustomer(customer);

                final Users driver = new Users();
                driver.setId(getChatsDto.driverId());
                chat.setDriver(driver);

                return chat;

            } catch (Exception e) {
                System.out.println("Fail to get dto to chat: " + e.getMessage());
            }
        }

        return null;
    }
}
