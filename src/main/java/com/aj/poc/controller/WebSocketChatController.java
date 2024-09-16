package com.aj.poc.controller;

import com.aj.poc.entity.WebSocketChatMessage;
import com.aj.poc.exception.UserException;
import com.aj.poc.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class WebSocketChatController {

    @Autowired
    private SignUpService signUpService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/springchat")
    public WebSocketChatMessage sendMessage(@Payload WebSocketChatMessage webSocketChatMessage) {
        return webSocketChatMessage;
    }

    @MessageMapping("/chat.newUser")
    @SendTo("/topic/springchat")
    public WebSocketChatMessage newUser(@Payload WebSocketChatMessage webSocketChatMessage,
                                        SimpMessageHeaderAccessor headerAccessor) {
        boolean isUserPresent = signUpService.checkIfUserIsSignedUp(webSocketChatMessage.getPhoneNumber());
        if (isUserPresent) {
            Objects.requireNonNull(headerAccessor.getSessionAttributes()).put("username", webSocketChatMessage.getUser());
        } else {
            throw new UserException("The user is not present in the application.");
        }
        return webSocketChatMessage;
    }
}
