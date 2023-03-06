public class Bird {
    /**
     * A variable (in this context, often referred to as a field), which represents the age of the bird.
     */
    public int ageMonths;

    /**
     * A constructor for the bird class: this method allows us to build a new bird with the 'new' keyword.
     * No need to change anything here, for now.
     */
    public Bird(){

    }
    /**
     * @return "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
     *         greater than or equal to 3.
     */
    public String sound(){
        if (ageMonths < 3) {
            return "Tweet";
        } else {
            return "Chirp";
        }
    }
}
