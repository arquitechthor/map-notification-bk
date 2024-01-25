package com.arquitecthor.notification.infrastructure.adapter.web.in;

import com.arquitecthor.notification.port.in.NotificationPort;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class NotificationController {
	
	private final NotificationPort notificationPort;

    @PostMapping("/send-mail")
    public ResponseEntity sendMail(@RequestBody SendMailRequest sendMailRequest) {
        notificationPort.sendMail(sendMailRequest);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
