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
import DataPair from './DataPair';
import Fdc3Context from './Fdc3Context';
import TemplateWithLinks from './TemplateWithLinks';
import ValueLabelDateDataPairListTemplateAllOf from './ValueLabelDateDataPairListTemplateAllOf';

/**
 * The ValueLabelDateDataPairListTemplate model module.
 * @module model/ValueLabelDateDataPairListTemplate
 */
class ValueLabelDateDataPairListTemplate {
    /**
     * Constructs a new <code>ValueLabelDateDataPairListTemplate</code>.
     * @alias module:model/ValueLabelDateDataPairListTemplate
     * @implements module:model/TemplateWithLinks
     * @implements module:model/ValueLabelDateDataPairListTemplateAllOf
     * @param headline {String} 
     */
    constructor(headline) { 
        TemplateWithLinks.initialize(this, headline);ValueLabelDateDataPairListTemplateAllOf.initialize(this);
        ValueLabelDateDataPairListTemplate.initialize(this, headline);
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
     * Constructs a <code>ValueLabelDateDataPairListTemplate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueLabelDateDataPairListTemplate} obj Optional instance to populate.
     * @return {module:model/ValueLabelDateDataPairListTemplate} The populated <code>ValueLabelDateDataPairListTemplate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueLabelDateDataPairListTemplate();
            TemplateWithLinks.constructFromObject(data, obj);
            ValueLabelDateDataPairListTemplateAllOf.constructFromObject(data, obj);

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
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = ApiClient.convertToType(data['label'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('list')) {
                obj['list'] = ApiClient.convertToType(data['list'], [DataPair]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} headline
 */
ValueLabelDateDataPairListTemplate.prototype['headline'] = undefined;

/**
 * @member {String} footer
 */
ValueLabelDateDataPairListTemplate.prototype['footer'] = undefined;

/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
ValueLabelDateDataPairListTemplate.prototype['fdc3Context'] = undefined;

/**
 * @member {Array.<module:model/ApplicationLink>} applicationLinks
 */
ValueLabelDateDataPairListTemplate.prototype['applicationLinks'] = undefined;

/**
 * @member {String} value
 */
ValueLabelDateDataPairListTemplate.prototype['value'] = undefined;

/**
 * @member {String} label
 */
ValueLabelDateDataPairListTemplate.prototype['label'] = undefined;

/**
 * @member {String} date
 */
ValueLabelDateDataPairListTemplate.prototype['date'] = undefined;

/**
 * @member {Array.<module:model/DataPair>} list
 */
ValueLabelDateDataPairListTemplate.prototype['list'] = undefined;


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
// Implement ValueLabelDateDataPairListTemplateAllOf interface:
/**
 * @member {String} value
 */
ValueLabelDateDataPairListTemplateAllOf.prototype['value'] = undefined;
/**
 * @member {String} label
 */
ValueLabelDateDataPairListTemplateAllOf.prototype['label'] = undefined;
/**
 * @member {String} date
 */
ValueLabelDateDataPairListTemplateAllOf.prototype['date'] = undefined;
/**
 * @member {Array.<module:model/DataPair>} list
 */
ValueLabelDateDataPairListTemplateAllOf.prototype['list'] = undefined;




export default ValueLabelDateDataPairListTemplate;

