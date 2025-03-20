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
import DataAnswer from './DataAnswer';
import NoAnswersBaseAllOf from './NoAnswersBaseAllOf';

/**
 * The NoAnswersBase model module.
 * @module model/NoAnswersBase
 */
class NoAnswersBase {
    /**
     * Constructs a new <code>NoAnswersBase</code>.
     * @alias module:model/NoAnswersBase
     * @implements module:model/DataAnswer
     * @implements module:model/NoAnswersBaseAllOf
     * @param template {String} 
     * @param message {String} 
     */
    constructor(template, message) { 
        DataAnswer.initialize(this, template);NoAnswersBaseAllOf.initialize(this, message);
        NoAnswersBase.initialize(this, template, message);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, template, message) { 
        obj['template'] = template;
        obj['message'] = message;
    }

    /**
     * Constructs a <code>NoAnswersBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NoAnswersBase} obj Optional instance to populate.
     * @return {module:model/NoAnswersBase} The populated <code>NoAnswersBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NoAnswersBase();
            DataAnswer.constructFromObject(data, obj);
            NoAnswersBaseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('template')) {
                obj['template'] = ApiClient.convertToType(data['template'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} template
 */
NoAnswersBase.prototype['template'] = undefined;

/**
 * @member {String} message
 */
NoAnswersBase.prototype['message'] = undefined;


// Implement DataAnswer interface:
/**
 * @member {String} template
 */
DataAnswer.prototype['template'] = undefined;
// Implement NoAnswersBaseAllOf interface:
/**
 * @member {String} message
 */
NoAnswersBaseAllOf.prototype['message'] = undefined;




export default NoAnswersBase;

