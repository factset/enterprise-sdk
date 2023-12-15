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
import ApplicationLink from './ApplicationLink';
import ColoredValue from './ColoredValue';
import ColoredValueLabelDateTemplateDataAllOf from './ColoredValueLabelDateTemplateDataAllOf';
import Fdc3Context from './Fdc3Context';
import TemplateWithLinks from './TemplateWithLinks';

/**
 * The ColoredValueLabelDateTemplateData model module.
 * @module model/ColoredValueLabelDateTemplateData
 */
class ColoredValueLabelDateTemplateData {
    /**
     * Constructs a new <code>ColoredValueLabelDateTemplateData</code>.
     * @alias module:model/ColoredValueLabelDateTemplateData
     * @implements module:model/TemplateWithLinks
     * @implements module:model/ColoredValueLabelDateTemplateDataAllOf
     * @param headline {String} 
     */
    constructor(headline) { 
        TemplateWithLinks.initialize(this, headline);ColoredValueLabelDateTemplateDataAllOf.initialize(this);
        ColoredValueLabelDateTemplateData.initialize(this, headline);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, headline) { 
        obj['headline'] = headline;
    }

    /**
     * Constructs a <code>ColoredValueLabelDateTemplateData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColoredValueLabelDateTemplateData} obj Optional instance to populate.
     * @return {module:model/ColoredValueLabelDateTemplateData} The populated <code>ColoredValueLabelDateTemplateData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColoredValueLabelDateTemplateData();
            TemplateWithLinks.constructFromObject(data, obj);
            ColoredValueLabelDateTemplateDataAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('headline')) {
                obj['headline'] = ApiClient.convertToType(data['headline'], 'String');
            }
            if (data.hasOwnProperty('footer')) {
                obj['footer'] = ApiClient.convertToType(data['footer'], 'String');
            }
            if (data.hasOwnProperty('fdc3Context')) {
                obj['fdc3Context'] = Fdc3Context.constructFromObject(data['fdc3Context']);
            }
            if (data.hasOwnProperty('applicationLinks')) {
                obj['applicationLinks'] = ApiClient.convertToType(data['applicationLinks'], [ApplicationLink]);
            }
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
 * @member {String} headline
 */
ColoredValueLabelDateTemplateData.prototype['headline'] = undefined;

/**
 * @member {String} footer
 */
ColoredValueLabelDateTemplateData.prototype['footer'] = undefined;

/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
ColoredValueLabelDateTemplateData.prototype['fdc3Context'] = undefined;

/**
 * @member {Array.<module:model/ApplicationLink>} applicationLinks
 */
ColoredValueLabelDateTemplateData.prototype['applicationLinks'] = undefined;

/**
 * @member {module:model/ColoredValue} value
 */
ColoredValueLabelDateTemplateData.prototype['value'] = undefined;

/**
 * @member {String} label
 */
ColoredValueLabelDateTemplateData.prototype['label'] = undefined;

/**
 * @member {String} date
 */
ColoredValueLabelDateTemplateData.prototype['date'] = undefined;


// Implement TemplateWithLinks interface:
/**
 * @member {String} headline
 */
TemplateWithLinks.prototype['headline'] = undefined;
/**
 * @member {String} footer
 */
TemplateWithLinks.prototype['footer'] = undefined;
/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
TemplateWithLinks.prototype['fdc3Context'] = undefined;
/**
 * @member {Array.<module:model/ApplicationLink>} applicationLinks
 */
TemplateWithLinks.prototype['applicationLinks'] = undefined;
// Implement ColoredValueLabelDateTemplateDataAllOf interface:
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




export default ColoredValueLabelDateTemplateData;

