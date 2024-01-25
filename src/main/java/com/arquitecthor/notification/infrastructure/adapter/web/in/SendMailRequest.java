package com.arquitecthor.notification.infrastructure.adapter.web.in;

import lombok.Builder;

@Builder
public class SendMailRequest {
    private String title;
    private String message;
}
