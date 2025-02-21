

# FederationData

Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query

## oneOf schemas
* [AdaptiveCard](AdaptiveCard.md)
* [MarkdownTable](MarkdownTable.md)
* [NextStep](NextStep.md)
* [ResponseText](ResponseText.md)
* [SuggestedPrompts](SuggestedPrompts.md)
* [Table](Table.md)

## Example
```java
// Import classes:
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FederationData;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.AdaptiveCard;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.MarkdownTable;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.NextStep;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ResponseText;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.SuggestedPrompts;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Table;

public class Example {
    public static void main(String[] args) {
        FederationData exampleFederationData = new FederationData();

        // create a new AdaptiveCard
        AdaptiveCard exampleAdaptiveCard = new AdaptiveCard();
        // set FederationData to AdaptiveCard
        exampleFederationData.setActualInstance(exampleAdaptiveCard);
        // to get back the AdaptiveCard set earlier
        AdaptiveCard testAdaptiveCard = (AdaptiveCard) exampleFederationData.getActualInstance();

        // create a new MarkdownTable
        MarkdownTable exampleMarkdownTable = new MarkdownTable();
        // set FederationData to MarkdownTable
        exampleFederationData.setActualInstance(exampleMarkdownTable);
        // to get back the MarkdownTable set earlier
        MarkdownTable testMarkdownTable = (MarkdownTable) exampleFederationData.getActualInstance();

        // create a new NextStep
        NextStep exampleNextStep = new NextStep();
        // set FederationData to NextStep
        exampleFederationData.setActualInstance(exampleNextStep);
        // to get back the NextStep set earlier
        NextStep testNextStep = (NextStep) exampleFederationData.getActualInstance();

        // create a new ResponseText
        ResponseText exampleResponseText = new ResponseText();
        // set FederationData to ResponseText
        exampleFederationData.setActualInstance(exampleResponseText);
        // to get back the ResponseText set earlier
        ResponseText testResponseText = (ResponseText) exampleFederationData.getActualInstance();

        // create a new SuggestedPrompts
        SuggestedPrompts exampleSuggestedPrompts = new SuggestedPrompts();
        // set FederationData to SuggestedPrompts
        exampleFederationData.setActualInstance(exampleSuggestedPrompts);
        // to get back the SuggestedPrompts set earlier
        SuggestedPrompts testSuggestedPrompts = (SuggestedPrompts) exampleFederationData.getActualInstance();

        // create a new Table
        Table exampleTable = new Table();
        // set FederationData to Table
        exampleFederationData.setActualInstance(exampleTable);
        // to get back the Table set earlier
        Table testTable = (Table) exampleFederationData.getActualInstance();
    }
}
```


