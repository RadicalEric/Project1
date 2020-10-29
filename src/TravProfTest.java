public class TravProfTest {

    public static void main(String[] args) {
        //Test 1
        MedCond TestMedCon = new MedCond("Dr.Xavier","123","Peanuts","stomach ache");

        TravProf TestTravProv = new TravProf("AB12", "Peter", "Parker", "4th Av", "884", 10, "WebSlinging", "IOU", TestMedCon);

        System.out.println("Test 1");
        System.out.println(TestTravProv.getTravAgentID());
        System.out.println(TestTravProv.getFirstName());
        System.out.println(TestTravProv.getLastName());
        System.out.println(TestTravProv.getAddress());
        System.out.println(TestTravProv.getPhone());
        System.out.println(TestTravProv.getTripCost());
        System.out.println(TestTravProv.getTravelType());
        System.out.println(TestTravProv.getPaymentType());

        //Test 2
        System.out.println("Test 2");
        TestTravProv.updateFirstName("Eddie");
        TestTravProv.updateLastName("Brock");
        TestTravProv.updateAddress("555 Av");
        TestTravProv.updatePhone("777");
        TestTravProv.updateTripCost(0);
        TestTravProv.updateTravelType("running");
        TestTravProv.updatePaymentType("stealing");
        MedCond TestMedCon2 = new MedCond("Dr.Octavious", "999", "lobster", "Parasite");
        TestTravProv.updateMedCondInfo(TestMedCon2);

        System.out.println(TestTravProv.getTravAgentID());
        System.out.println(TestTravProv.getFirstName());
        System.out.println(TestTravProv.getLastName());
        System.out.println(TestTravProv.getAddress());
        System.out.println(TestTravProv.getPhone());
        System.out.println(TestTravProv.getTripCost());
        System.out.println(TestTravProv.getTravelType());
        System.out.println(TestTravProv.getPaymentType());




    }
}
