package com.arquitecthor.notification.application;

import com.arquitecthor.notification.infrastructure.adapter.web.in.SendMailRequest;
import com.arquitecthor.notification.infrastructure.annotation.UseCase;
import com.arquitecthor.notification.port.in.NotificationPort;
import com.arquitecthor.notification.port.out.SendMailPort;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class NotificationUseCase implements NotificationPort {
	
	private final SendMailPort sendMailPort;

	@Override
	public void sendMail(SendMailRequest sendMailRequest) {
		sendMailPort.sendMail(sendMailRequest);
	}
}
