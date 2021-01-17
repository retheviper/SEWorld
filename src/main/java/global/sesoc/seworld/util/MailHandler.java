package global.sesoc.seworld.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHandler {

	private final JavaMailSender mailSender;

	private final MimeMessage message;

	private final MimeMessageHelper messageHelper;

	public MailHandler(final JavaMailSender mailSender) throws MessagingException {
		this.mailSender = mailSender;
		this.message = this.mailSender.createMimeMessage();
		this.messageHelper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());
	}

	public void setSubject(final String subject) throws MessagingException {
		messageHelper.setSubject(subject);
	}

	public void setText(final String htmlContent) throws MessagingException {
		messageHelper.setText(htmlContent, true);
	}

	public void setFrom(final String email, final String name) throws UnsupportedEncodingException, MessagingException {
		messageHelper.setFrom(email, name);
	}

	public void setTo(final String email) throws MessagingException {
		messageHelper.setTo(email);
	}

	public void addInline(final String contentId, final DataSource dataSource) throws MessagingException {
		messageHelper.addInline(contentId, dataSource);
	}

	public void send() {
		mailSender.send(message);
	}
}
