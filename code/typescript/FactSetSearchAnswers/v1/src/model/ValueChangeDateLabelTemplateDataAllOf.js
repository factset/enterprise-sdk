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
import ValueChange from './ValueChange';

/**
 * The ValueChangeDateLabelTemplateDataAllOf model module.
 * @module model/ValueChangeDateLabelTemplateDataAllOf
 */
class ValueChangeDateLabelTemplateDataAllOf {
    /**
     * Constructs a new <code>ValueChangeDateLabelTemplateDataAllOf</code>.
     * @alias module:model/ValueChangeDateLabelTemplateDataAllOf
     */
    constructor() { 
        
        ValueChangeDateLabelTemplateDataAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ValueChangeDateLabelTemplateDataAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueChangeDateLabelTemplateDataAllOf} obj Optional instance to populate.
     * @return {module:model/ValueChangeDateLabelTemplateDataAllOf} The populated <code>ValueChangeDateLabelTemplateDataAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueChangeDateLabelTemplateDataAllOf();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('valueChange')) {
                obj['valueChange'] = ValueChange.constructFromObject(data['valueChange']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = ApiClient.convertToType(data['label'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} value
 */
ValueChangeDateLabelTemplateDataAllOf.prototype['value'] = undefined;

/**
 * @member {module:model/ValueChange} valueChange
 */
ValueChangeDateLabelTemplateDataAllOf.prototype['valueChange'] = undefined;

/**
 * @member {String} date
 */
ValueChangeDateLabelTemplateDataAllOf.prototype['date'] = undefined;

/**
 * @member {String} label
 */
ValueChangeDateLabelTemplateDataAllOf.prototype['label'] = undefined;






export default ValueChangeDateLabelTemplateDataAllOf;

