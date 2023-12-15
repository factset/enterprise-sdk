/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AnswerWithTitle from './AnswerWithTitle';
import ValueLabelDateTextBlockAnswerAllOf from './ValueLabelDateTextBlockAnswerAllOf';
import ValueLabelDateTextBlockTemplateData from './ValueLabelDateTextBlockTemplateData';

/**
 * The ValueLabelDateTextBlockAnswer model module.
 * @module model/ValueLabelDateTextBlockAnswer
 */
class ValueLabelDateTextBlockAnswer {
    /**
     * Constructs a new <code>ValueLabelDateTextBlockAnswer</code>.
     * @alias module:model/ValueLabelDateTextBlockAnswer
     * @implements module:model/AnswerWithTitle
     * @implements module:model/ValueLabelDateTextBlockAnswerAllOf
     * @param template {String} 
     * @param title {String} 
     * @param templateData {module:model/ValueLabelDateTextBlockTemplateData} 
     */
    constructor(template, title, templateData) { 
        AnswerWithTitle.initialize(this, template, title);ValueLabelDateTextBlockAnswerAllOf.initialize(this, templateData);
        ValueLabelDateTextBlockAnswer.initialize(this, template, title, templateData);
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
     * Constructs a <code>ValueLabelDateTextBlockAnswer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueLabelDateTextBlockAnswer} obj Optional instance to populate.
     * @return {module:model/ValueLabelDateTextBlockAnswer} The populated <code>ValueLabelDateTextBlockAnswer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueLabelDateTextBlockAnswer();
            AnswerWithTitle.constructFromObject(data, obj);
            ValueLabelDateTextBlockAnswerAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('template')) {
                obj['template'] = ApiClient.convertToType(data['template'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('templateData')) {
                obj['templateData'] = ValueLabelDateTextBlockTemplateData.constructFromObject(data['templateData']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} template
 */
ValueLabelDateTextBlockAnswer.prototype['template'] = undefined;

/**
 * @member {String} title
 */
ValueLabelDateTextBlockAnswer.prototype['title'] = undefined;

/**
 * @member {module:model/ValueLabelDateTextBlockTemplateData} templateData
 */
ValueLabelDateTextBlockAnswer.prototype['templateData'] = undefined;


// Implement AnswerWithTitle interface:
/**
 * @member {String} template
 */
AnswerWithTitle.prototype['template'] = undefined;
/**
 * @member {String} title
 */
AnswerWithTitle.prototype['title'] = undefined;
// Implement ValueLabelDateTextBlockAnswerAllOf interface:
/**
 * @member {module:model/ValueLabelDateTextBlockTemplateData} templateData
 */
ValueLabelDateTextBlockAnswerAllOf.prototype['templateData'] = undefined;




export default ValueLabelDateTextBlockAnswer;

