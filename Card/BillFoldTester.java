public class BillFoldTester
{
    public static void Test()
    {
        IDCard id = new IDCard("Nikhil","16117");
        DriverLicense drive = new DriverLicense("Nikhil", "2020");
        BillFold billFold = new BillFold();
        billFold.addCard(id);
        billFold.addCard(drive);
        System.out.println(billFold.formatCards());
    }
}
