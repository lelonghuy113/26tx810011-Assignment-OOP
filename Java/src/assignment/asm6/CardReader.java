package assignment.asm6;

public abstract class CardReader extends Reader {
    private int cardMonths;

    public CardReader(String readerId, String fullName, String email, int cardMonths) {
        super(readerId, fullName, email);
        this.cardMonths = cardMonths;
    }

    public int getCardMonths() {
        return cardMonths;
    }

    public void renewCard(int months) {
        if (months > 0) {
            cardMonths += months;
        }
    }
}