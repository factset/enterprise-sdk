/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ColoredValue from './ColoredValue';

/**
 * The ColoredValueLabelDateTemplateDataAllOf model module.
 * @module model/ColoredValueLabelDateTemplateDataAllOf
 */
class ColoredValueLabelDateTemplateDataAllOf {
    /**
     * Constructs a new <code>ColoredValueLabelDateTemplateDataAllOf</code>.
     * @alias module:model/ColoredValueLabelDateTemplateDataAllOf
     */
    constructor() { 
        
        ColoredValueLabelDateTemplateDataAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ColoredValueLabelDateTemplateDataAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColoredValueLabelDateTemplateDataAllOf} obj Optional instance to populate.
     * @return {module:model/ColoredValueLabelDateTemplateDataAllOf} The populated <code>ColoredValueLabelDateTemplateDataAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColoredValueLabelDateTemplateDataAllOf();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ColoredValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = ApiClient.convertToType(data['label'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ColoredValue} value
 */
ColoredValueLabelDateTemplateDataAllOf.prototype['value'] = undefined;

/**
 * @member {String} label
 */
ColoredValueLabelDateTemplateDataAllOf.prototype['label'] = undefined;

/**
 * @member {String} date
 */
ColoredValueLabelDateTemplateDataAllOf.prototype['date'] = undefined;






export default ColoredValueLabelDateTemplateDataAllOf;
