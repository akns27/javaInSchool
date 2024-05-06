//인터페이스
interface MessageSend {
		void sendMessage(String message);
	}

	// 이메일 전송
	class EmailSender implements MessageSend {
		@Override
		public void sendMessage(String message) {
			System.out.println("문자를 보냄: " + message);
		}
	}

	// SMS 전송
	 class SMSSender implements MessageSend {
		@Override
		public void sendMessage(String message) {
			System.out.println("SMS를 보냄: " + message);
		}
	}

public class MessageSender {
	public static void main(String[] args) {
		// 이메일 전송
		MessageSend emailSender = new EmailSender();
		emailSender.sendMessage("이건 이메일 메시지입니다!");
		// SMS 전송
		MessageSend smsSender = new SMSSender();
		smsSender.sendMessage("이건 SMS 메시지입니다!");
	}
}
