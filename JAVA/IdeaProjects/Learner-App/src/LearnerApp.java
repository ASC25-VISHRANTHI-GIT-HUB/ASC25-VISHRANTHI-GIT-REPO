public class LearnerApp 
{   
    public static void main (String[] args)
    {
        /*LearnerArrayData LearnerData = new LearnerArrayData();
        LearnerData.assignLearnerName();
        LearnerData.printLearnerNames();

        */

        //workingWithArrays();

    }
    private static void workingWithMaps(){
        LearnerAnswerMap learnerAnswers = new LearnerAnswerMap();
        learnerAnswers.assignLearnerAnswers();
        learnerAnswers.displayLearnersAnswers();
    }
    private static void workingWithArrays()
    {
        LearnerArrayData learnerAnswers = new LearnerArrayData();
        learnerAnswers.assignLearnerName();
        learnerAnswers.printLearnerNames();
    }
}