public class MedCondTest {

    public static void main(String[] args) {

        //Test 1
        MedCond TestMedCon = new MedCond("Dr.Xavier","123","Peanuts","stomach ache");

        System.out.println(TestMedCon.getMdContact());
        System.out.println(TestMedCon.getMdPhone());
        System.out.println(TestMedCon.getAlgType());
        System.out.println(TestMedCon.getMdContact());

        TestMedCon.updateMdContact("Dr.Doom");
        TestMedCon.updateMdPhone("000");
        TestMedCon.updateAlgType("Shell Fish");
        TestMedCon.updateIllType("Spider Bites");


        //Test 2
        System.out.println(TestMedCon.getMdContact());
        System.out.println(TestMedCon.getMdPhone());
        System.out.println(TestMedCon.getAlgType());
        System.out.println(TestMedCon.getIllType());

    }

}
