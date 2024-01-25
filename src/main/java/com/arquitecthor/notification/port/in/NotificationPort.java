package com.arquitecthor.notification.port.in;

import com.arquitecthor.notification.infrastructure.adapter.web.in.SendMailRequest;

public interface NotificationPort {
    void sendMail(SendMailRequest sendMailRequest);
}
