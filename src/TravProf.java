
public class TravProf {

    private String travAgentID;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private float tripCost;
    private String travelType;
    private String paymentType;
    private MedCond medCondInfo;


    //Constructor
    TravProf(String travAgentID, String firstName, String lastName, String address, String phone, float tripCost, String travelType, String paymentType, MedCond medCondInfo ){
        this.travAgentID = travAgentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.tripCost = tripCost;
        this.travelType = travelType;
        this.paymentType = paymentType;
        this.medCondInfo = medCondInfo;
    }


    //Get Methods
    public String getTravAgentID(){
        return this.travAgentID;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getAddress(){
        return this.address;
    }

    public String getPhone(){
        return this.phone;
    }

    public float getTripCost(){
        return this.tripCost;
    }

    public String getTravelType(){
        return this.travelType;
    }

    public String getPaymentType(){
        return this.paymentType;
    }

    public MedCond getMedCondInfo(){
        return this.medCondInfo;
    }



    //Update Methods
    public void updateFirstName(String firstName){
        this.firstName = firstName;
    }

    public void updateLastName(String lastName){
        this.lastName = lastName;
    }

    public void updateAddress(String address){ this.address = address; }

    public void updatePhone(String phone){
        this.phone = phone;
    }

    public void updateTripCost(float tripCost){
        this.tripCost =tripCost;
    }

    public void updateTravelType(String travelType){
        this.travelType = travelType;
    }

    public void updatePaymentType(String paymentType){
        this.paymentType = paymentType;
    }

    public void updateMedCondInfo(MedCond medCondInfo){
        this.medCondInfo = medCondInfo ;
    }


}
