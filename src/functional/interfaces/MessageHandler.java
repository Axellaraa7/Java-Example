package functional.interfaces;

@FunctionalInterface
public interface MessageHandler {
	String modifyMessage(String message);
	
	default String modifyMessage(String message, String modify) {
		return message+"->"+modify;
	}
}
