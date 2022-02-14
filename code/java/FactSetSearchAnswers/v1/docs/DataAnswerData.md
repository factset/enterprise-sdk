

# DataAnswerData

## oneOf schemas
* [Answer](Answer.md)
* [AnswerWithoutData](AnswerWithoutData.md)
* [NoAnswersFound](NoAnswersFound.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetSearchAnswers.models.DataAnswerData;
import com.factset.sdk.FactSetSearchAnswers.models.Answer;
import com.factset.sdk.FactSetSearchAnswers.models.AnswerWithoutData;
import com.factset.sdk.FactSetSearchAnswers.models.NoAnswersFound;

public class Example {
    public static void main(String[] args) {
        DataAnswerData exampleDataAnswerData = new DataAnswerData();

        // create a new Answer
        Answer exampleAnswer = new Answer();
        // set DataAnswerData to Answer
        exampleDataAnswerData.setActualInstance(exampleAnswer);
        // to get back the Answer set earlier
        Answer testAnswer = (Answer) exampleDataAnswerData.getActualInstance();

        // create a new AnswerWithoutData
        AnswerWithoutData exampleAnswerWithoutData = new AnswerWithoutData();
        // set DataAnswerData to AnswerWithoutData
        exampleDataAnswerData.setActualInstance(exampleAnswerWithoutData);
        // to get back the AnswerWithoutData set earlier
        AnswerWithoutData testAnswerWithoutData = (AnswerWithoutData) exampleDataAnswerData.getActualInstance();

        // create a new NoAnswersFound
        NoAnswersFound exampleNoAnswersFound = new NoAnswersFound();
        // set DataAnswerData to NoAnswersFound
        exampleDataAnswerData.setActualInstance(exampleNoAnswersFound);
        // to get back the NoAnswersFound set earlier
        NoAnswersFound testNoAnswersFound = (NoAnswersFound) exampleDataAnswerData.getActualInstance();
    }
}
```


