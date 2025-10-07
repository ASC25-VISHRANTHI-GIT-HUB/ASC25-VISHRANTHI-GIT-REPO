public class LearnerArrayData {
    private String[] learnerNames = new String[6];
    public void assignLearnerName() {
        learnerNames[0] = "Aadhil Ahamed Meeran";
        learnerNames[1] = "Vishranthi A";
        learnerNames[2] = "Soundarya K";
        learnerNames[3] = "Kaviya HR";
        learnerNames[4] = "Priya";
        learnerNames[5] = "Lekha";

    }
    public void printLearnerNames()
    {
        System.out.println(learnerNames);
//        for(int i=0;i<learnerNames.length;i++)
//        {
//            System.out.println(learnerNames[i]);
//        }
        for (String name:learnerNames)
        {
            System.out.println(name);
        }
    }
}