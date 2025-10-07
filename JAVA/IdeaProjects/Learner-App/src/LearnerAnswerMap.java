import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;
public class LearnerAnswerMap{
    //HashMap
    TreeMap<String,String> learnerAnswersMap =new TreeMap <String,String>();
    public void assignLearnerAnswers()
    {
        learnerAnswersMap.put("Maheen","Private variables cannot be accessed outside the class");
        learnerAnswersMap.put("Gagan","The main method should always be main, otherwise we will not be able to run the program");
        learnerAnswersMap.put("Kyati","The HashMap belongs to java.util package");
        learnerAnswersMap.put("Mavya","Identified the objects");
        learnerAnswersMap.put("Anjali","Identified the classes");
        learnerAnswersMap.put("Kyati","System Defined class: HashMap");
        learnerAnswersMap.put("Charishma","String Class");
        learnerAnswersMap.put("Vis","Ordering : Unordered, Insertion Order, Sort Order");
        learnerAnswersMap.put("Swapna","Fetch the key and value");
    }
    public void displayLearnersAnswers()
    {
        System.out.println(learnerAnswersMap);
//      for(String key: learnerAnswersMap.keySet())
//      {
//          System.out.println(key+" : "+learnerAnswersMap.get(key));
//      }
        Set<String> learnerSet=learnerAnswersMap.keySet();
        System.out.println(learnerSet);

        Collection<String> learnerValues=learnerAnswersMap.values();
        System.out.println(learnerValues);
    }
}