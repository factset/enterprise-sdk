/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.7
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AdaptiveCard from './AdaptiveCard';
import NextStep from './NextStep';
import Phrase from './Phrase';
import PromptItem from './PromptItem';
import ResponseText from './ResponseText';
import SuggestedPrompts from './SuggestedPrompts';
import Table from './Table';

/**
 * The FederationData model module.
 * @module model/FederationData
 */
class FederationData {
    /**
     * Constructs a new <code>FederationData</code>.
     * Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query
     * @alias module:model/FederationData
     * @implements module:model/ResponseText
     * @implements module:model/AdaptiveCard
     * @implements module:model/Table
     * @implements module:model/NextStep
     * @implements module:model/SuggestedPrompts
     * @param type {module:model/FederationData.TypeEnum} Datatype contained in this data object
     * @param value {Array.<module:model/PromptItem>} List of suggested prompts
     */
    constructor(type, value) { 
        ResponseText.initialize(this, type, value);AdaptiveCard.initialize(this, type, value);Table.initialize(this, type, value);NextStep.initialize(this, type, value);SuggestedPrompts.initialize(this, type, value);
        FederationData.initialize(this, type, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, value) { 
        obj['type'] = type;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>FederationData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FederationData} obj Optional instance to populate.
     * @return {module:model/FederationData} The populated <code>FederationData</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['type']) {
            case 'AdaptiveCard':
              return AdaptiveCard.constructFromObject(data, obj);
            case 'NextStep':
              return NextStep.constructFromObject(data, obj);
            case 'SuggestedPrompts':
              return SuggestedPrompts.constructFromObject(data, obj);
            case 'Table':
              return Table.constructFromObject(data, obj);
            case 'string':
              return ResponseText.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * Datatype contained in this data object
 * @member {module:model/FederationData.TypeEnum} type
 */
FederationData.prototype['type'] = undefined;

/**
 * List of suggested prompts
 * @member {Array.<module:model/PromptItem>} value
 */
FederationData.prototype['value'] = undefined;

/**
 * A map of citations, where the keys are the citation IDs and the values are the citation schema objects.
 * @member {Object.<String, Array.<module:model/Phrase>>} citations
 */
FederationData.prototype['citations'] = undefined;


// Implement ResponseText interface:
/**
 * Datatype contained in this data object
 * @member {module:model/ResponseText.TypeEnum} type
 */
ResponseText.prototype['type'] = undefined;
/**
 * String containing LLM natural language response to the query
 * @member {String} value
 */
ResponseText.prototype['value'] = undefined;
/**
 * A map of citations, where the keys are the citation IDs and the values are the citation schema objects.
 * @member {Object.<String, Array.<module:model/Phrase>>} citations
 */
ResponseText.prototype['citations'] = undefined;
// Implement AdaptiveCard interface:
/**
 * Datatype contained in this data object
 * @member {module:model/AdaptiveCard.TypeEnum} type
 */
AdaptiveCard.prototype['type'] = undefined;
/**
 * A JSON-serialized Adaptive Card object modeled after the [Adaptive Card schema](https://adaptivecards.io/explorer/).
 * @member {Object} value
 */
AdaptiveCard.prototype['value'] = undefined;
// Implement Table interface:
/**
 * Datatype contained in this data object
 * @member {module:model/Table.TypeEnum} type
 */
Table.prototype['type'] = undefined;
/**
 * Data table represented in [FactSet STACH V3](https://factset.github.io/stachschema/#/v3/README) format
 * @member {Object} value
 */
Table.prototype['value'] = undefined;
// Implement NextStep interface:
/**
 * Datatype contained in this data object
 * @member {module:model/NextStep.TypeEnum} type
 */
NextStep.prototype['type'] = undefined;
/**
 * List of NextStep action items
 * @member {Array.<module:model/NextStepItem>} value
 */
NextStep.prototype['value'] = undefined;
// Implement SuggestedPrompts interface:
/**
 * Datatype contained in this data object
 * @member {module:model/SuggestedPrompts.TypeEnum} type
 */
SuggestedPrompts.prototype['type'] = undefined;
/**
 * List of suggested prompts
 * @member {Array.<module:model/PromptItem>} value
 */
SuggestedPrompts.prototype['value'] = undefined;



/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
FederationData['TypeEnum'] = {

    /**
     * value: "SuggestedPrompts"
     * @const
     */
    "SuggestedPrompts": "SuggestedPrompts"
};



export default FederationData;

