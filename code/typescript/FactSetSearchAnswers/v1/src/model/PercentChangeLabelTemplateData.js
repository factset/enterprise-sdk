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
import ApplicationLink from './ApplicationLink';
import Fdc3Context from './Fdc3Context';
import PercentChange from './PercentChange';
import PercentChangeLabelTemplateDataAllOf from './PercentChangeLabelTemplateDataAllOf';
import TemplateWithLinks from './TemplateWithLinks';

/**
 * The PercentChangeLabelTemplateData model module.
 * @module model/PercentChangeLabelTemplateData
 */
class PercentChangeLabelTemplateData {
    /**
     * Constructs a new <code>PercentChangeLabelTemplateData</code>.
     * @alias module:model/PercentChangeLabelTemplateData
     * @implements module:model/TemplateWithLinks
     * @implements module:model/PercentChangeLabelTemplateDataAllOf
     * @param headline {String} 
     */
    constructor(headline) { 
        TemplateWithLinks.initialize(this, headline);PercentChangeLabelTemplateDataAllOf.initialize(this);
        PercentChangeLabelTemplateData.initialize(this, headline);
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
     * Constructs a <code>PercentChangeLabelTemplateData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PercentChangeLabelTemplateData} obj Optional instance to populate.
     * @return {module:model/PercentChangeLabelTemplateData} The populated <code>PercentChangeLabelTemplateData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PercentChangeLabelTemplateData();
            TemplateWithLinks.constructFromObject(data, obj);
            PercentChangeLabelTemplateDataAllOf.constructFromObject(data, obj);

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
            if (data.hasOwnProperty('percentChange')) {
                obj['percentChange'] = PercentChange.constructFromObject(data['percentChange']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = ApiClient.convertToType(data['label'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} headline
 */
PercentChangeLabelTemplateData.prototype['headline'] = undefined;

/**
 * @member {String} footer
 */
PercentChangeLabelTemplateData.prototype['footer'] = undefined;

/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
PercentChangeLabelTemplateData.prototype['fdc3Context'] = undefined;

/**
 * @member {Array.<module:model/ApplicationLink>} applicationLinks
 */
PercentChangeLabelTemplateData.prototype['applicationLinks'] = undefined;

/**
 * @member {module:model/PercentChange} percentChange
 */
PercentChangeLabelTemplateData.prototype['percentChange'] = undefined;

/**
 * @member {String} label
 */
PercentChangeLabelTemplateData.prototype['label'] = undefined;


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
// Implement PercentChangeLabelTemplateDataAllOf interface:
/**
 * @member {module:model/PercentChange} percentChange
 */
PercentChangeLabelTemplateDataAllOf.prototype['percentChange'] = undefined;
/**
 * @member {String} label
 */
PercentChangeLabelTemplateDataAllOf.prototype['label'] = undefined;




export default PercentChangeLabelTemplateData;

