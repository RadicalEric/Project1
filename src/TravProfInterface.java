import java.util.Scanner;

public class TravProfInterface {

    TravProfDB Database;
    String ID;
    String InFile;

    TravProfInterface(String File){
        Database = new TravProfDB(File);
        InFile = File;


    }
   void getUserChoice(){


        String input = "Null";
        Scanner scan = new Scanner(System.in);

        while(!input.equals( "Exit")) {
            System.out.println("Please Enter Your Agent ID Or Type Exit To Quit: ");



            input = scan.nextLine();
            ID = input;


            while(!input.equals( "Back")) {





                System.out.println("Hello User "+ID+" Please Select An Option Below By Typing Its Number");
                System.out.println("(0) Delete A Travelers Profile");
                System.out.println("(1) Find A Travelers Profile");
                System.out.println("(2) Update A Travelers Profile");
                System.out.println("(3) Display All Travelers Profiles That You Manage");
                System.out.println("(4) Write All Files In Memory To The 'Database'");
                System.out.println("(5) Load All Files From The Database Into Memory");
                System.out.println("(6) Create A New Travelers Profile");
                System.out.println("(7) Go Back");
                System.out.println("\n");
                input = scan.nextLine();

                switch (input) {
                    case "0": deleteTravProf();

                        break;
                    case "1": findTravProf();

                        break;

                    case "2": updateTravProf();

                        break;

                    case "3": displayAllTravProf();

                        break;
                    case "4": writeToDB();

                        break;
                    case "5": initDB();

                        break;
                    case "6": createNewTravProf();

                        break;
                    case "7":
                        input = "Back";

                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }

        }
       System.out.println("Thank You, Good Bye!");
    }
    void deleteTravProf(){
        System.out.println("Please Enter The Last Name Of The Person Who's Profile You Want To Delete");
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Database.deleteProfile(ID, input);

    }
    void findTravProf(){
        System.out.println("Please Enter The Last Name Of The Person Who's Profile You Want To Find");
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        //Account for Null
        TravProf Profile = Database.findProfile(ID, input);
        if(Profile != null){
            displayTravProf(Profile);
        }
        else{System.out.println("Could Not Find Profile");}

    }
    void updateTravProf() {

        String input = "Null";
        Scanner scan = new Scanner(System.in);


            System.out.println("Enter The Last Name Of The Person Who's Profile You Want To Update");


            input = scan.nextLine();


                TravProf Profile = Database.findProfile(ID, input);
                if (Profile != null) {

                        System.out.println("Please Select An Option Below By Typing Its Number");
                        System.out.println("(0) Update First Name");
                        System.out.println("(1) Update Last Name");
                        System.out.println("(2) Update Address");
                        System.out.println("(3) Update Phone Number");
                        System.out.println("(4) Update Trip Cost");
                        System.out.println("(5) Update Type Of Travel");
                        System.out.println("(6) Update Payment Type");
                        System.out.println("(7) Update Medical Information");
                        System.out.println("(8) Go Back");
                        System.out.println("\n");
                    input = scan.nextLine();

                    switch (input) {
                        case "0":
                            System.out.println("Enter The First Name You Want To Update To");
                            input = scan.nextLine();

                                Profile.updateFirstName(input);
                                System.out.println("Profile First Name Updated");



                            break;
                        case "1":
                            System.out.println("Enter The Last Name You Want To Update To");
                            input = scan.nextLine();

                                Profile.updateLastName(input);
                                System.out.println("Profile Last Name Updated");


                            break;

                        case "2":
                            System.out.println("Enter The Address You Want To Update To");
                            input = scan.nextLine();

                                Profile.updateAddress(input);
                                System.out.println("Profile Address Updated");

                            break;
                        case "3":
                            System.out.println("Enter The Phone Number You Want To Update To");
                            input = scan.nextLine();

                                Profile.updatePhone(input);
                                System.out.println("Profile Phone Number Updated");


                            break;
                        case "4":
                            System.out.println("Enter The Trip Cost You Want To Update To");
                            input = scan.nextLine();
                            boolean correct = input.matches("[-+]?[0-9]*\\.?[0-9]+");
                            while(!correct){

                                System.out.println("The Cost Of The Trip Must Be A Whole Number Or Decimal!");
                                System.out.println("Please Enter The Cost Of The Trip");
                                input = scan.nextLine();
                                correct = input.matches("[-+]?[0-9]*\\.?[0-9]+");
                            }
                            float cost = Float.parseFloat(input);

                                Profile.updateTripCost(cost);
                                System.out.println("Profile Trip Cost Updated");


                            break;

                        case "5":
                            System.out.println("Enter The Type Of Travel You Want To Update To");
                            System.out.println("(0) Pleasure");
                            System.out.println("(1) Business");
                            String travelType;
                            input = scan.nextLine();

                            while(!input.equals("0") && !input.equals("1")){
                                System.out.println("Input Must Be Either Business Or Pleasure!");
                                System.out.println("Please Enter The Type Of Travel");
                                System.out.println("(0) Pleasure");
                                System.out.println("(1) Business");
                                input = scan.nextLine();
                            }
                            if (input.equals("0")){
                                travelType = "Pleasure";
                            }
                            else{
                                 travelType = "Business";
                            }

                                Profile.updateTravelType(travelType);
                                System.out.println("Profile Type Of Travel Updated");


                            break;
                        case "6":
                            System.out.println("Enter The Payment Type You Want To Update");
                            System.out.println("(0) Credit");
                            System.out.println("(1) Check");
                            System.out.println("(2) Debit");
                            System.out.println("(3) Invoice");
                            String paymentType;
                            input = scan.nextLine();
                            while(!input.equals("0") && !input.equals("1")&& !input.equals("2")&& !input.equals("3")){
                                System.out.println("Input Must Be Credit, Check, Debit Or Invoice!");
                                System.out.println("Please Enter The Payment Type");
                                System.out.println("(0) Credit");
                                System.out.println("(1) Check");
                                System.out.println("(2) Debit");
                                System.out.println("(3) Invoice");
                                input = scan.nextLine();
                            }
                            if (input.equals("0")){
                                paymentType = "Credit";
                            }
                            else if (input.equals("1")){
                                paymentType = "Check";
                            }
                            else if (input.equals("2")){
                                paymentType = "Debit";
                            }
                            else{
                                paymentType = "Invoice";
                            }

                                Profile.updatePaymentType(paymentType);
                                System.out.println("Profile Payment Type Updated");


                            break;
                        case "7":

                            MedCond MedInfo = Profile.getMedCondInfo();
                            System.out.println("Please Select An Option Below By Typing Its Number");
                            System.out.println("(0) Update Medical Contact");
                            System.out.println("(1) Update Medical Phone");
                            System.out.println("(2) Update Allergy");
                            System.out.println("(3) Update Illness");
                            System.out.println("(4) Go Back");
                            System.out.println("\n");


                            input = scan.nextLine();
                            switch (input) {
                                case "0":
                                    System.out.println("Enter The Name Of The Medical Contact You Want To Update");
                                    input = scan.nextLine();

                                        MedInfo.updateMdContact(input);
                                        System.out.println("Medical Contact Updated");



                                    break;

                                case "1":
                                    System.out.println("Enter The Phone Of The Medical Contact You Want To Update");
                                    input = scan.nextLine();

                                        MedInfo.updateMdPhone(input);
                                        System.out.println("Medical Contact Phone Updated");



                                    break;

                                case "2":
                                    System.out.println("Enter The Allergy You Want To Update");
                                    input = scan.nextLine();

                                        MedInfo.updateAlgType(input);
                                        System.out.println("Allergy Updated");


                                    break;

                                case "3":
                                    System.out.println("Enter The Illness You Want To Update");
                                    input = scan.nextLine();
                                    if(!input.equals("Back")) {
                                        MedInfo.updateIllType(input);
                                        System.out.println("Illness Updated");
                                    }

                                    break;

                                case"4 ":
                                    break;


                                default:
                                    System.out.println("Invalid Input");
                            }



                            break;
                        case "8":

                            break;

                        default:
                            System.out.println("Invalid Input");
                    }




                    }
                else {
                        System.out.println("Profile Does Not Exist");


                    }


                }



    void displayTravProf(TravProf Profile){
        String travAgentID = ID;
        String firstName;
        String lastName;
        String address;
        String phone;
        float tripCost;
        String travelType;
        String paymentType;
        MedCond medCondInfo;
        String mdContact;
        String mdPhone;
        String algType;
        String illType;

        firstName = Profile.getFirstName();
        lastName = Profile.getLastName();
        address = Profile.getAddress();
        phone = Profile.getPhone();
        tripCost = Profile.getTripCost();
        travelType = Profile.getTravelType();
        paymentType = Profile.getPaymentType();
        medCondInfo = Profile.getMedCondInfo();
        mdContact = medCondInfo.getMdContact();
        mdPhone = medCondInfo.getMdPhone();
        algType = medCondInfo.getAlgType();
        illType = medCondInfo.getIllType();

        System.out.println("Agent ID: " + ID + " First Name: " + firstName + " Last Name: " + lastName + " Address: " + address + " Phone: " + phone + " Trip Cost: " + tripCost + " Travel Type: " + travelType
                + " Payment Type: " + paymentType + " Medical Contact: " + mdContact + " Medical Phone: " + mdPhone + " Allergies: " + algType + " Illness: " + illType);





    }
    void displayAllTravProf(){
        String travAgentID = ID;
        String firstName;
        String lastName;
        String address;
        String phone;
        float tripCost;
        String travelType;
        String paymentType;
        MedCond medCondInfo;
        String mdContact;
        String mdPhone;
        String algType;
        String illType;

        TravProf Profile = Database.findFirstProfile();
        while(Profile != null){
            if(Profile.getTravAgentID().equals(ID)) {
                firstName = Profile.getFirstName();
                lastName = Profile.getLastName();
                address = Profile.getAddress();
                phone = Profile.getPhone();
                tripCost = Profile.getTripCost();
                travelType = Profile.getTravelType();
                paymentType = Profile.getPaymentType();
                medCondInfo = Profile.getMedCondInfo();
                mdContact = medCondInfo.getMdContact();
                mdPhone = medCondInfo.getMdPhone();
                algType = medCondInfo.getAlgType();
                illType = medCondInfo.getIllType();

                System.out.println("Agent ID: " + ID + " First Name: " + firstName + " Last Name: " + lastName + " Address: " + address + " Phone: " + phone + " Trip Cost: " + tripCost + " Travel Type: " + travelType
                        + " Payment Type: " + paymentType + " Medical Contact: " + mdContact + " Medical Phone: " + mdPhone + " Allergies: " + algType + " Illness: " + illType);


            }
            Profile = Database.findNextProfile();

        }
        System.out.println("Profile List Complete");
    }
    void writeToDB(){Database.writeAllTravProf(InFile);}
    void initDB(){Database.initializeDataBase(InFile);}
    TravProf createNewTravProf(){

        String travAgentID = ID;
        String firstName;
        String lastName;
        String address;
        String phone;
        float tripCost;
        String travelType = "Default";
        String paymentType;
        MedCond medCondInfo;



        String input;
        Scanner scan = new Scanner(System.in);


        System.out.println("Please Enter The Travelers First Name");
        input = scan.nextLine();
        firstName = input;
        System.out.println("Please Enter The Travelers Last Name");
        input = scan.nextLine();
        lastName = input;
        System.out.println("Please Enter The Travelers Adress");
        input = scan.nextLine();
        address = input;

        System.out.println("Please Enter The Travelers Phone Number");
        input = scan.nextLine();
        phone = input;

        System.out.println("Please Enter The Cost Of The Trip");
        input = scan.nextLine();
        boolean correct = input.matches("[-+]?[0-9]*\\.?[0-9]+");
        while(!correct){

            System.out.println("The Cost Of The Trip Must Be A Whole Number Or Decimal!");
            System.out.println("Please Enter The Cost Of The Trip");
            input = scan.nextLine();
            correct = input.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
        float cost = Float.parseFloat(input);
        tripCost = cost;

        System.out.println("Please Enter The Type Of Travel");
        System.out.println("(0) Pleasure");
        System.out.println("(1) Business");
        input = scan.nextLine();

        while(!input.equals("0") && !input.equals("1")){
            System.out.println("Input Must Be Either Business Or Pleasure!");
            System.out.println("Please Enter The Type Of Travel");
            System.out.println("(0) Pleasure");
            System.out.println("(1) Business");
            input = scan.nextLine();
        }
        if (input.equals("0")){
            travelType = "Pleasure";
        }
        else{
            travelType = "Business";
        }


        System.out.println("Please Enter The Payment Type");
        System.out.println("(0) Credit");
        System.out.println("(1) Check");
        System.out.println("(2) Debit");
        System.out.println("(3) Invoice");
        input = scan.nextLine();
        while(!input.equals("0") && !input.equals("1")&& !input.equals("2")&& !input.equals("3")){
            System.out.println("Input Must Be Credit, Check, Debit Or Invoice!");
            System.out.println("Please Enter The Payment Type");
            System.out.println("(0) Credit");
            System.out.println("(1) Check");
            System.out.println("(2) Debit");
            System.out.println("(3) Invoice");
            input = scan.nextLine();
        }
        if (input.equals("0")){
            paymentType = "Credit";
        }
        else if (input.equals("1")){
            paymentType = "Check";
        }
        else if (input.equals("2")){
            paymentType = "Debit";
        }
        else{
            paymentType = "Invoice";
        }


        medCondInfo = createNewMedCont();

        TravProf Profile = new TravProf(travAgentID,firstName,lastName,address,phone,tripCost,travelType,paymentType,medCondInfo);

        Database.insertNewProfile(Profile);
        System.out.println("Profile Created");

        return Profile;


    }
    MedCond createNewMedCont(){
        String mdContact;
        String mdPhone;
        String algType;
        String illType;

        String input;
        Scanner scan = new Scanner(System.in);


        System.out.println("Please Enter A Medical Contact");
        input = scan.nextLine();
        mdContact = input;
        System.out.println("Please Enter A Medical Phone Number");
        input = scan.nextLine();
        mdPhone = input;


        System.out.println("Please Enter An Allergy");
        System.out.println("(0) none");
        System.out.println("(1) food");
        System.out.println("(2) medication");
        System.out.println("(3) other");
        input = scan.nextLine();


        while(!input.equals("0") && !input.equals("1")&& !input.equals("2")&& !input.equals("3")){
            System.out.println("Please Select One Of The Listed Allergies!");
            System.out.println("(0) none");
            System.out.println("(1) food");
            System.out.println("(2) medication");
            System.out.println("(3) other");
            input = scan.nextLine();
        }
        if (input.equals("0")){
            algType = "none";
        }
        else if (input.equals("1")){
            algType = "food";
        }
        else if (input.equals("2")){
            algType = "medication";
        }
        else{
            algType = "other";
        }

        System.out.println("Please Enter An Illness");
        System.out.println("(0) none");
        System.out.println("(1) heart");
        System.out.println("(2) diabetes");
        System.out.println("(3) asthma");
        System.out.println("(4) other");
        input = scan.nextLine();

        while(!input.equals("0") && !input.equals("1")&& !input.equals("2")&& !input.equals("3")&& !input.equals("4")){
            System.out.println("Please Select One Of the Listed Illnesses!");
            System.out.println("(0) none");
            System.out.println("(1) heart");
            System.out.println("(2) diabetes");
            System.out.println("(3) asthma");
            System.out.println("(4) other");
            input = scan.nextLine();
        }
        if (input.equals("0")){
            illType = "none";
        }
        else if (input.equals("1")){
            illType = "heart";
        }
        else if (input.equals("3")){
            illType = "diabetes";
        }
        else if (input.equals("4")){
            illType = "asthma";
        }
        else{
            illType = "other";
        }


        MedCond MedicalInfo = new MedCond(mdContact,mdPhone,algType,illType);
        return MedicalInfo;


    }


}
