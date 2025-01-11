package com.voicecontrol.controller;

import com.voicecontrol.util.Response;
import com.voicecontrol.util.VoiceCommand;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VoiceCommandController {

    @PostMapping("/voice-command")
    public Response processVoiceCommand(@RequestBody VoiceCommand command) {
        String message = processCommand(command.getCommand());
        return new Response(message);
    }

    // Simple command processing (you can extend this logic)
    private String processCommand(String command) {
        if (command.toLowerCase().contains("turn on the light")) {
            // Logic to turn on the light (integration with smart device)
            return "Light turned on!";
        } else if (command.toLowerCase().contains("turn off the light")) {
            // Logic to turn off the light
            return "Light turned off!";
        } else {
            return "Command not recognized!";
        }
    }
}




