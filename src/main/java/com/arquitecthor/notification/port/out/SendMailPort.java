package com.arquitecthor.notification.port.out;

import com.arquitecthor.notification.infrastructure.adapter.web.in.SendMailRequest;

public interface SendMailPort {
    void sendMail(SendMailRequest sendMailRequest);
}
