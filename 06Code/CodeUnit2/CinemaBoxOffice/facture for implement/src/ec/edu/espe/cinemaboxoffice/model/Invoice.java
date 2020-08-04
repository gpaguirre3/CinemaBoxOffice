package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Gabriel Aguirre
 */
public class Invoice {
    private String lastCreditCardDigits;
    private String identifyCard;
    private Movie movie;

    public String getLastCreditCardDigits() {
        return lastCreditCardDigits;
    }

    public void setLastCreditCardDigits(String lastCreditCardDigits) {
        this.lastCreditCardDigits = lastCreditCardDigits;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
