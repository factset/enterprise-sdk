/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AnswerWithTitle from './AnswerWithTitle';
import ValueLabelDateDataPairListAnswerAllOf from './ValueLabelDateDataPairListAnswerAllOf';
import ValueLabelDateDataPairListTemplateData from './ValueLabelDateDataPairListTemplateData';

/**
 * The ValueLabelDateDataPairListAnswer model module.
 * @module model/ValueLabelDateDataPairListAnswer
 */
class ValueLabelDateDataPairListAnswer {
    /**
     * Constructs a new <code>ValueLabelDateDataPairListAnswer</code>.
     * @alias module:model/ValueLabelDateDataPairListAnswer
     * @implements module:model/AnswerWithTitle
     * @implements module:model/ValueLabelDateDataPairListAnswerAllOf
     * @param template {String} 
     * @param title {String} 
     * @param templateData {module:model/ValueLabelDateDataPairListTemplateData} 
     */
    constructor(template, title, templateData) { 
        AnswerWithTitle.initialize(this, template, title);ValueLabelDateDataPairListAnswerAllOf.initialize(this, templateData);
        ValueLabelDateDataPairListAnswer.initialize(this, template, title, templateData);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, template, title, templateData) { 
        obj['template'] = template;
        obj['title'] = title;
        obj['templateData'] = templateData;
    }

    /**
     * Constructs a <code>ValueLabelDateDataPairListAnswer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueLabelDateDataPairListAnswer} obj Optional instance to populate.
     * @return {module:model/ValueLabelDateDataPairListAnswer} The populated <code>ValueLabelDateDataPairListAnswer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueLabelDateDataPairListAnswer();
            AnswerWithTitle.constructFromObject(data, obj);
            ValueLabelDateDataPairListAnswerAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('template')) {
                obj['template'] = ApiClient.convertToType(data['template'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('templateData')) {
                obj['templateData'] = ValueLabelDateDataPairListTemplateData.constructFromObject(data['templateData']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} template
 */
ValueLabelDateDataPairListAnswer.prototype['template'] = undefined;

/**
 * @member {String} title
 */
ValueLabelDateDataPairListAnswer.prototype['title'] = undefined;

/**
 * @member {module:model/ValueLabelDateDataPairListTemplateData} templateData
 */
ValueLabelDateDataPairListAnswer.prototype['templateData'] = undefined;


// Implement AnswerWithTitle interface:
/**
 * @member {String} template
 */
AnswerWithTitle.prototype['template'] = undefined;
/**
 * @member {String} title
 */
AnswerWithTitle.prototype['title'] = undefined;
// Implement ValueLabelDateDataPairListAnswerAllOf interface:
/**
 * @member {module:model/ValueLabelDateDataPairListTemplateData} templateData
 */
ValueLabelDateDataPairListAnswerAllOf.prototype['templateData'] = undefined;




export default ValueLabelDateDataPairListAnswer;

