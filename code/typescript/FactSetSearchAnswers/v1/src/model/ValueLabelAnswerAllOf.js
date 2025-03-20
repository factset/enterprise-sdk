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
import ValueLabelTemplateData from './ValueLabelTemplateData';

/**
 * The ValueLabelAnswerAllOf model module.
 * @module model/ValueLabelAnswerAllOf
 */
class ValueLabelAnswerAllOf {
    /**
     * Constructs a new <code>ValueLabelAnswerAllOf</code>.
     * @alias module:model/ValueLabelAnswerAllOf
     * @param templateData {module:model/ValueLabelTemplateData} 
     */
    constructor(templateData) { 
        
        ValueLabelAnswerAllOf.initialize(this, templateData);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, templateData) { 
        obj['templateData'] = templateData;
    }

    /**
     * Constructs a <code>ValueLabelAnswerAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueLabelAnswerAllOf} obj Optional instance to populate.
     * @return {module:model/ValueLabelAnswerAllOf} The populated <code>ValueLabelAnswerAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueLabelAnswerAllOf();

            if (data.hasOwnProperty('templateData')) {
                obj['templateData'] = ValueLabelTemplateData.constructFromObject(data['templateData']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ValueLabelTemplateData} templateData
 */
ValueLabelAnswerAllOf.prototype['templateData'] = undefined;






export default ValueLabelAnswerAllOf;

