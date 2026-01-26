package chap1.factory;

public class SenderFactory {
    private SenderFactory() {
        // No op
    }

    public static Sender getSender(String type) {
        // Utiliser idéalement une Enum
        return switch (type.toLowerCase()) {
            case "email" -> new Email();
            case "sms" -> new Sms();
            default -> null;
        };
    }
}
