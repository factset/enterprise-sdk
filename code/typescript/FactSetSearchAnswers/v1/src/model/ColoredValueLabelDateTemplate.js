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
import ApplicationLink from './ApplicationLink';
import ColoredValue from './ColoredValue';
import ColoredValueLabelDateTemplateAllOf from './ColoredValueLabelDateTemplateAllOf';
import Fdc3Context from './Fdc3Context';
import TemplateWithLinks from './TemplateWithLinks';

/**
 * The ColoredValueLabelDateTemplate model module.
 * @module model/ColoredValueLabelDateTemplate
 */
class ColoredValueLabelDateTemplate {
    /**
     * Constructs a new <code>ColoredValueLabelDateTemplate</code>.
     * @alias module:model/ColoredValueLabelDateTemplate
     * @implements module:model/TemplateWithLinks
     * @implements module:model/ColoredValueLabelDateTemplateAllOf
     * @param headline {String} 
     */
    constructor(headline) { 
        TemplateWithLinks.initialize(this, headline);ColoredValueLabelDateTemplateAllOf.initialize(this);
        ColoredValueLabelDateTemplate.initialize(this, headline);
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
     * Constructs a <code>ColoredValueLabelDateTemplate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColoredValueLabelDateTemplate} obj Optional instance to populate.
     * @return {module:model/ColoredValueLabelDateTemplate} The populated <code>ColoredValueLabelDateTemplate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColoredValueLabelDateTemplate();
            TemplateWithLinks.constructFromObject(data, obj);
            ColoredValueLabelDateTemplateAllOf.constructFromObject(data, obj);

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
ColoredValueLabelDateTemplate.prototype['headline'] = undefined;

/**
 * @member {String} footer
 */
ColoredValueLabelDateTemplate.prototype['footer'] = undefined;

/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
ColoredValueLabelDateTemplate.prototype['fdc3Context'] = undefined;

/**
 * @member {Array.<module:model/ApplicationLink>} applicationLinks
 */
ColoredValueLabelDateTemplate.prototype['applicationLinks'] = undefined;

/**
 * @member {module:model/ColoredValue} value
 */
ColoredValueLabelDateTemplate.prototype['value'] = undefined;

/**
 * @member {String} label
 */
ColoredValueLabelDateTemplate.prototype['label'] = undefined;

/**
 * @member {String} date
 */
ColoredValueLabelDateTemplate.prototype['date'] = undefined;


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
// Implement ColoredValueLabelDateTemplateAllOf interface:
/**
 * @member {module:model/ColoredValue} value
 */
ColoredValueLabelDateTemplateAllOf.prototype['value'] = undefined;
/**
 * @member {String} label
 */
ColoredValueLabelDateTemplateAllOf.prototype['label'] = undefined;
/**
 * @member {String} date
 */
ColoredValueLabelDateTemplateAllOf.prototype['date'] = undefined;




export default ColoredValueLabelDateTemplate;

