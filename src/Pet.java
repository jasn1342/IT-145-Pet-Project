public class Pet {

	//Declare fields
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;

    //Constructor Methods
    public Pet () {
    	petType = "none";
        petName = "none";
        petAge = 0;
        dogSpace = 0;
        daysStay = 0;
        amountDue = 0.0;
    }



    // Setters
    void setPetType(final String type) {
        petType = type;
    }

    void setPetName(final String name) {
        petName = name;
    }

    void setPetAge(final int age) {
        petAge = age;
    }

    void setDogSpace(final int spaceNumber) {
        dogSpace = spaceNumber;
    }

    void setCatSpace(final int cSpace) {
        catSpace = cSpace;
    }

    void setDayStay(final int length) {
        daysStay = length;
    }

    // Total charges
    void setAmountDue(final double totalCharges) {
        amountDue = totalCharges;
    }

    //Getters
    String getPetType() {
        return petType;
    }
    String getPetName() {
        return petName;
    }
    int getPetAge() {
        return petAge;
    }
    int getDogSpace() {
        return dogSpace;
    }
    int getCatSpace() {
        return catSpace;
    }
    int getDayStay() {
        return daysStay;
    }
    double getAmountDue() {
        return amountDue;
    }

    Scanner scan = new Scanner(System.in);

    //Check-in pet
    public void checkIn(){
    }

    //Check-out pet
    public void checkOut(){
    }

    //Get pet info
    public void getPetInfo(){
    }

    //Create Pet
    public void createPet(){
    }

    //Update pet
    public void updatePet() {
    }
}
