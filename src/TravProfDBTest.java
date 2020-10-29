//import java.util.ArrayList;
//public class TravProfDBTest {
//
//
//    public static void main(String[] args) {
//
//
//
//
//        //Test1();
//        //Test2();
//        //Test3();
//        //Test4();
//
//
//    }
//
//
//    public static void Test1 (){
//        TravProfDB TestDB = new TravProfDB("TestDatabase");
//        System.out.println("Adding");
//
//        for (int i = 0; i < 10; i++) {
//            MedCond Med = new MedCond(Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i));
//
//            TravProf Prof = new TravProf("ID12", Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i), 10, Integer.toString(i), Integer.toString(i), Med);
//
//
//            TestDB.insertNewProfile(Prof);
//            System.out.println("Adding Profile Number "+ i);
//            System.out.println(TestDB.travelerList[i].gettravAgentID());
//            System.out.println(TestDB.travelerList[i].getFirstName());
//            System.out.println(TestDB.travelerList[i].getLastName());
//            System.out.println(TestDB.travelerList[i].getAddres());
//            System.out.println(TestDB.travelerList[i].getPhone());
//            System.out.println(TestDB.travelerList[i].getTripCost());
//            System.out.println(TestDB.travelerList[i].getTravelType());
//            System.out.println(TestDB.travelerList[i].getPaymentType());
//            System.out.println("array Size");
//            System.out.println(TestDB.travelerList.length);
//
//        }
//        //for loop deleting elements from DB
//        System.out.println("Deleting");
//        for (int i = 9; i >=0; i--) {
//            System.out.println(" deleting Profile Number "+ i);
//            System.out.println(TestDB.travelerList[i].gettravAgentID());
//            System.out.println(TestDB.travelerList[i].getFirstName());
//            System.out.println(TestDB.travelerList[i].getLastName());
//            System.out.println(TestDB.travelerList[i].getAddres());
//            System.out.println(TestDB.travelerList[i].getPhone());
//            System.out.println(TestDB.travelerList[i].getTripCost());
//            System.out.println(TestDB.travelerList[i].getTravelType());
//            System.out.println(TestDB.travelerList[i].getPaymentType());
//
//            TestDB.deleteProfile("ID12", Integer.toString(i));
//
//            System.out.println("array Size");
//            System.out.println(TestDB.travelerList.length);
//
//        }
//        int i = 0;
//        MedCond Med = new MedCond(Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i));
//
//        TravProf Prof = new TravProf("ID12", Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i), 10, Integer.toString(i), Integer.toString(i), Med);
//
//
//        TestDB.insertNewProfile(Prof);
//        System.out.println("Adding Profile Number "+ i);
//        System.out.println(TestDB.travelerList[i].gettravAgentID());
//        System.out.println(TestDB.travelerList[i].getFirstName());
//        System.out.println(TestDB.travelerList[i].getLastName());
//        System.out.println(TestDB.travelerList[i].getAddres());
//        System.out.println(TestDB.travelerList[i].getPhone());
//        System.out.println(TestDB.travelerList[i].getTripCost());
//        System.out.println(TestDB.travelerList[i].getTravelType());
//        System.out.println(TestDB.travelerList[i].getPaymentType());
//        System.out.println("array Size");
//        System.out.println(TestDB.travelerList.length);
//
//
//
//
//    }
//
//
//    public static void Test2(){
//        TravProfDB TestDB = new TravProfDB("TestDatabase");
//        //for loop adding  elements to DB
//        for (int i = 0; i < 4; i++) {
//            MedCond Med = new MedCond(Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i));
//
//            TravProf Prof = new TravProf("ID12", Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i), 10, Integer.toString(i), Integer.toString(i), Med);
//            TestDB.insertNewProfile(Prof);
//
//        }
//
//
//
//                for (int i = 0; i < 4; i++) {
//            System.out.println("Profile Number "+ i);
//            System.out.println(TestDB.travelerList[i].gettravAgentID());
//            System.out.println(TestDB.travelerList[i].getFirstName());
//            System.out.println(TestDB.travelerList[i].getLastName());
//            System.out.println(TestDB.travelerList[i].getAddres());
//            System.out.println(TestDB.travelerList[i].getPhone());
//            System.out.println(TestDB.travelerList[i].getTripCost());
//            System.out.println(TestDB.travelerList[i].getTravelType());
//            System.out.println(TestDB.travelerList[i].getPaymentType());
//
//        }
//                //Delete Profile 1
//                System.out.println("\nDeleting 1\n");
//                TestDB.deleteProfile("ID12", "1");
//
//
//        //Print remaining profiles
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Profile Number "+ i);
//            System.out.println(TestDB.travelerList[i].gettravAgentID());
//            System.out.println(TestDB.travelerList[i].getFirstName());
//            System.out.println(TestDB.travelerList[i].getLastName());
//            System.out.println(TestDB.travelerList[i].getAddres());
//            System.out.println(TestDB.travelerList[i].getPhone());
//            System.out.println(TestDB.travelerList[i].getTripCost());
//            System.out.println(TestDB.travelerList[i].getTravelType());
//            System.out.println(TestDB.travelerList[i].getPaymentType());
//
//        }
//
//
//
//
//    }
//
//    public static void Test3(){
//        TravProfDB TestDB = new TravProfDB("TestDatabase");
//
//        //for loop adding elements to DB
//        for (int i = 0; i < 2; i++) {
//            MedCond Med = new MedCond(Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i));
//
//            TravProf Prof = new TravProf("ID12", Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i), 10, Integer.toString(i), Integer.toString(i), Med);
//            TestDB.insertNewProfile(Prof);
//
//        }
//        //Find Profile and Print info
//        TravProf Profile1 = TestDB.findProfile("ID12","1");
//        System.out.println("Found Profile1");
//        System.out.println(Profile1.getTravAgentID());
//        System.out.println(Profile1.getFirstName());
//        System.out.println(Profile1.getLastName());
//        System.out.println(Profile1.getAddress());
//        System.out.println(Profile1.getPhone());
//        System.out.println(Profile1.getTripCost());
//        System.out.println(Profile1.getTravelType());
//        System.out.println(Profile1.getPaymentType());
//
//
//        //Find First, Find Next, and print
//        System.out.println("\nTesting find first and find next \n");
//        System.out.println("\nFirst Profile \n");
//        TravProf FirstProfile = TestDB.findFirstProfile();
//
//        System.out.println(FirstProfile.getTravAgentID());
//        System.out.println(FirstProfile.getFirstName());
//        System.out.println(FirstProfile.getLastName());
//        System.out.println(FirstProfile.getAddress());
//        System.out.println(FirstProfile.getPhone());
//        System.out.println(FirstProfile.getTripCost());
//        System.out.println(FirstProfile.getTravelType());
//        System.out.println(FirstProfile.getPaymentType());
//
//        System.out.println("\nNext Profile \n");
//        TravProf NextProfile = TestDB.findNextProfile();
//        System.out.println(NextProfile.getTravAgentID());
//        System.out.println(NextProfile.getFirstName());
//        System.out.println(NextProfile.getLastName());
//        System.out.println(NextProfile.getAddress());
//        System.out.println(NextProfile.getPhone());
//        System.out.println(NextProfile.getTripCost());
//        System.out.println(NextProfile.getTravelType());
//        System.out.println(NextProfile.getPaymentType());
//
//
//
//        //Try to find a non existent profile and print
//        TravProf ProfileNull = TestDB.findProfile("IDNULL","NULL");
//        System.out.println("\nPrinting Non existent profile");
//        System.out.println("\n");
//        System.out.println(ProfileNull.getTravAgentID());
//        System.out.println(ProfileNull.getFirstName());
//        System.out.println(ProfileNull.getLastName());
//        System.out.println(ProfileNull.getAddress());
//        System.out.println(ProfileNull.getPhone());
//        System.out.println(ProfileNull.getTripCost());
//        System.out.println(ProfileNull.getTravelType());
//        System.out.println(ProfileNull.getPaymentType());
//
//    }
//
//    public static void Test4(){
//        //create TravProvDB instance
//        TravProfDB TestDBWrite = new TravProfDB("TestDatabase");
//
//        //insert 3 profiles
//        for (int i = 0; i < 3; i++) {
//            MedCond Med = new MedCond(Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i));
//
//            TravProf Prof = new TravProf("ID12", Integer.toString(i), Integer.toString(i), Integer.toString(i), Integer.toString(i), 10, Integer.toString(i), Integer.toString(i), Med);
//            TestDBWrite.insertNewProfile(Prof);
//
//        }
//
//        //Write to "database" aka text file
//        TestDBWrite.writeAllTravProf("TestDatabase");
//
//        //create new TravProvDB instance
//        TravProfDB TestDBRead = new TravProfDB("TestDatabase");
//
//        //pull info from "database" aka text file
//        TestDBRead.initializeDataBase("TestDatabase");
//
//        //Distplay profiles read from "database"
//        System.out.println("Read Profiles ");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Profile Number "+ i);
//            System.out.println(TestDBRead.travelerList[i].gettravAgentID());
//            System.out.println(TestDBRead.travelerList[i].getFirstName());
//            System.out.println(TestDBRead.travelerList[i].getLastName());
//            System.out.println(TestDBRead.travelerList[i].getAddres());
//            System.out.println(TestDBRead.travelerList[i].getPhone());
//            System.out.println(TestDBRead.travelerList[i].getTripCost());
//            System.out.println(TestDBRead.travelerList[i].getTravelType());
//            System.out.println(TestDBRead.travelerList[i].getPaymentType());
//            System.out.println((TestDBRead.travelerList[i].getMedCondInfo().getMdContact()));
//            System.out.println((TestDBRead.travelerList[i].getMedCondInfo().getMdPhone()));
//            System.out.println((TestDBRead.travelerList[i].getMedCondInfo().getAlgType()));
//            System.out.println((TestDBRead.travelerList[i].getMedCondInfo().getIllType()));
//
//        }
//
//
//
//    }
//
//
//
//
//
//
//}