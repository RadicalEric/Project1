import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TravProfDB {

    private int numTravelers;
    private int currentTravelerIndex= 0;
    private String fileName;

    private TravProf[] travelerList = new TravProf[0];

    TravProfDB(String File){
        fileName = File;
    }

    void insertNewProfile(TravProf Profile){

        //Check if Array is full, if so Double Size
        if(this.numTravelers == this.travelerList.length){
            //if The size of the array is zero, make it 1
            if(this.travelerList.length == 0){this.travelerList = new TravProf[1];}
            //Double Size
            this.travelerList = Arrays.copyOf(this.travelerList,this.travelerList.length * 2);
        }

        //place element in the array
        this.travelerList[this.numTravelers] = Profile;
        //increment number of travelers
        this.numTravelers +=1;

    }


    boolean deleteProfile(String ID, String Lname){


        TravProf foundProfile = findProfile(ID,Lname);

        //If Profile found, proceed, else return false
        if( foundProfile != null){

            //if the array is half empty, shorten it and delete the profile that was found
            if(numTravelers == travelerList.length/2){
                //Create smaller traveler list the size of the number of traveler profiles
                TravProf[] SmallerTravelerList = new TravProf[this.numTravelers];

                //Traverse the profiles in the array and place them in the new shorter array unless they are the profiles that is supposed to be deleted or null
                for(int i = 0, j = 0 ; i < this.numTravelers; i++){
                    TravProf idxProfile = this.travelerList[i];
                    if(foundProfile == idxProfile || idxProfile == null){
                        ;//pass

                    }
                    else{
                        SmallerTravelerList[j] = idxProfile;
                        j++;
                    }

                }

                //Set tavelersList to new small list
                this.travelerList = SmallerTravelerList;
                //decrement number of travelers
                this.numTravelers --;

            }

            //If array does not need to be adjusted, only delete found profile
            else{
                //Traverse traveler profile array until the profile that needs to be removed is found
                for(int i = 0 ; i < this.numTravelers; i++){
                    if(this.travelerList[i] == foundProfile){
                        //Replace the index of the "deleted" profile with the last element of the array and replace the
                        //index of the last element of the array with null
                        this.travelerList[i] = this.travelerList[this.numTravelers-1];
                        this.travelerList[this.numTravelers-1] = null;


                    }


                }
                //decrement numTravelers
                this.numTravelers --;

            }
            //return true if a profile was deleted
            return true;
        }
        return false;
    }



    TravProf findProfile(String ID, String Lname){
        //Traverse traveler list until profile is found by comparing Agent ID and Last name with elements,
        for(int i = 0;i<this.numTravelers;i++){

            if(this.travelerList[i].getLastName().equals(Lname) && this.travelerList[i].getTravAgentID().equals(ID)){
                return this.travelerList[i];
            }
            }
        //return null if profile not found
        return null;
        }

    TravProf findFirstProfile(){
        //return index 0 profile of travelerList if num travelers >0, return null otherwise
        if (this.numTravelers==0){
            return null;
        }
        this.currentTravelerIndex = 0;
        return this.travelerList[0];
    }

    TravProf findNextProfile(){
        //index +1 then return the corresponding profile in the array as long as the index is within the array, else return null
        this.currentTravelerIndex+=1;
        if(this.currentTravelerIndex < this.travelerList.length){
        return this.travelerList[this.currentTravelerIndex];}
        else{return null;}
    }
    void writeAllTravProf(String File){


        try {
            //Create new Writer object
            FileWriter myWriter = new FileWriter(File);

            //For each profile, capture its information into string variables
            for (int i = 0; i<this.numTravelers; i++){

                String travAgentID = this.travelerList[i].getTravAgentID();
                String firstName = this.travelerList[i].getFirstName();
                String lastName = this.travelerList[i].getLastName();
                String address = this.travelerList[i].getAddress();
                String phone = this.travelerList[i].getPhone();
                float tripCost = this.travelerList[i].getTripCost();
                String travelType = this.travelerList[i].getTravelType();
                String paymentType = this.travelerList[i].getPaymentType();
                MedCond medCondInfo = this.travelerList[i].getMedCondInfo();

                String mdContact = medCondInfo.getMdContact();
                String mdPhone = medCondInfo.getMdPhone();
                String algType = medCondInfo.getAlgType();
                String illType = medCondInfo.getIllType();



                //for each profile write information to file location.
                //Information is comma separated, The semi colon denotes the split between travel info and medical info
                myWriter.write(travAgentID +","+ firstName +","+ lastName +","+ address  +","+ phone  +","+ tripCost
                        +","+ travelType +","+ paymentType +";"+ mdContact +","+ mdPhone +","+ algType +","+ illType +"\n");


            }



            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



    void initializeDataBase(String File){
        try {

            File myFile = new File(File);
            Scanner myReader = new Scanner(myFile);
            //read file line by line, extract info and place info into travelers list with the insert function
            while (myReader.hasNextLine()) {
                //Get data from line
                String data = myReader.nextLine();

                // Split lines on semi colon denoting split between travel info and medical info
                String[] ProfAndMed =  data.split(";");

                //split info on commas and place into array
                String[] TravProfData = ProfAndMed[0].split(",");
                String[] MedCondData = ProfAndMed[1].split(",");





                //extract info from split arrays
                    String travAgentID = TravProfData[0];
                    String firstName = TravProfData[1];
                    String lastName = TravProfData[2];
                    String address = TravProfData[3];
                    String phone = TravProfData[4];
                    float tripCost = Float.parseFloat(TravProfData[5]);
                    String travelType = TravProfData[6];
                    String paymentType = TravProfData[7];


                    String mdContact = MedCondData[0];
                    String mdPhone =  MedCondData[1];
                    String algType =  MedCondData[2];
                    String illType =  MedCondData[3];
                    MedCond MedicalInfo = new MedCond(mdContact,mdPhone,algType,illType);



                    //create a new travel profile with extracted info
                    TravProf Profile = new TravProf(travAgentID,firstName,lastName,address,phone,tripCost,travelType,paymentType,MedicalInfo);

                    //insert the new profile
                    insertNewProfile(Profile);



                }






            }





        catch (FileNotFoundException e) {
            System.out.println("There was an error using the file");
        }



    }







    }