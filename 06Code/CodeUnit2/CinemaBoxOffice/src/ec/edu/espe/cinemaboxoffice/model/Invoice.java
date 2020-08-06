package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Gabriel Aguirre
 */
public class Invoice {
    private String customerName;
    private String identifyCard;
    private String lastCreditCardDigits;
    private String movieTitle;
    private float price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getLastCreditCardDigits() {
        return lastCreditCardDigits;
    }

    public void setLastCreditCardDigits(String lastCreditCardDigits) {
        this.lastCreditCardDigits = lastCreditCardDigits;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
