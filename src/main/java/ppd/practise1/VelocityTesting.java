package ppd.practise1;

public class VelocityTesting {
	
}
	
/*
	@Service
	@PropertySource("classpath:config.properties")
	public class VelocityTesting {
		
		@Autowired
		private JavaMailSenderImpl mailSender;
		
		@Autowired
		private VelocityEngine velocityEngine;
		
		@Value("${mail.smtp.host}")
		private String m_sSmtp = null;

		@Value("${mail.smtp.socketFactory.port}")
		private String m_sSmtpSocketFactoryPort = null;

		@Value("${mail.smtp.port}")
		private String m_sSmtpPort = null;

		@Value("${mail.from}")
		private String m_sFrom = null;

		@Override
		public void sendUserCreationMail(EmailTemplateDto emailTemplateDto ) {
			
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			try {
				 
	            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true,"UTF-8");
	            mimeMessageHelper.setSubject(emailTemplateDto.getSubject());
	            mimeMessageHelper.setFrom(m_sFrom);
	            mimeMessageHelper.setTo(emailTemplateDto.getToAddress());
	           
	            VelocityContext velocityContext = new VelocityContext();
	            velocityContext.put("resetLink", emailTemplateDto.getResetPasswordLink());
	            velocityContext.put("line1", emailTemplateDto.getLine1());
	            velocityContext.put("line2", emailTemplateDto.getLine2());
	            velocityContext.put("line3", emailTemplateDto.getLine3());
	            velocityContext.put("line4", emailTemplateDto.getLine4());
	            velocityContext.put("line5", emailTemplateDto.getLine5());
	            velocityContext.put("line6", emailTemplateDto.getLine6());
	            velocityContext.put("line7", emailTemplateDto.getLine7());
	            
	            StringWriter stringWriter = new StringWriter();
	            velocityEngine.mergeTemplate("/vm/userCreationMailTemplate.vm", "UTF-8", velocityContext, stringWriter);          
	            mimeMessageHelper.setText(stringWriter.toString(), true);
	 
	            mailSender.send(mimeMessageHelper.getMimeMessage());
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
		}
		
	}


*/