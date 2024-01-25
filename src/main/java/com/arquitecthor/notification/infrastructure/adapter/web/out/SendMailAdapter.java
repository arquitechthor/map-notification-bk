package com.arquitecthor.notification.infrastructure.adapter.web.out;

import com.arquitecthor.notification.infrastructure.adapter.web.in.SendMailRequest;
import com.arquitecthor.notification.infrastructure.annotation.WebAdapter;
import com.arquitecthor.notification.port.out.SendMailPort;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@WebAdapter
@AllArgsConstructor
public class SendMailAdapter implements SendMailPort {

    @Override
    public void sendMail(SendMailRequest sendMailRequest) {

    }
}
