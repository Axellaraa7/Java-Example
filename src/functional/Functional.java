package functional;

import functional.interfaces.MessageHandler;

public class Functional {

	public static void main(String[] args) {
		MessageHandler mHandler = (message) -> message+"->Using Lambda expression";
		String messageLambda = mHandler.modifyMessage("Hello world");
		System.out.println(messageLambda);
		String messageDefault = mHandler.modifyMessage("Hola mundo","Using default method");
		System.out.println(messageDefault);
	}

}
