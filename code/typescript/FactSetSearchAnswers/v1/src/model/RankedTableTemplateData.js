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
import Fdc3Context from './Fdc3Context';
import RankedTable from './RankedTable';
import RankedTableTemplateDataAllOf from './RankedTableTemplateDataAllOf';
import Template from './Template';

/**
 * The RankedTableTemplateData model module.
 * @module model/RankedTableTemplateData
 */
class RankedTableTemplateData {
    /**
     * Constructs a new <code>RankedTableTemplateData</code>.
     * @alias module:model/RankedTableTemplateData
     * @implements module:model/Template
     * @implements module:model/RankedTableTemplateDataAllOf
     * @param headline {String} 
     */
    constructor(headline) { 
        Template.initialize(this, headline);RankedTableTemplateDataAllOf.initialize(this);
        RankedTableTemplateData.initialize(this, headline);
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
     * Constructs a <code>RankedTableTemplateData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RankedTableTemplateData} obj Optional instance to populate.
     * @return {module:model/RankedTableTemplateData} The populated <code>RankedTableTemplateData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RankedTableTemplateData();
            Template.constructFromObject(data, obj);
            RankedTableTemplateDataAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('headline')) {
                obj['headline'] = ApiClient.convertToType(data['headline'], 'String');
            }
            if (data.hasOwnProperty('footer')) {
                obj['footer'] = ApiClient.convertToType(data['footer'], 'String');
            }
            if (data.hasOwnProperty('fdc3Context')) {
                obj['fdc3Context'] = Fdc3Context.constructFromObject(data['fdc3Context']);
            }
            if (data.hasOwnProperty('table')) {
                obj['table'] = RankedTable.constructFromObject(data['table']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} headline
 */
RankedTableTemplateData.prototype['headline'] = undefined;

/**
 * @member {String} footer
 */
RankedTableTemplateData.prototype['footer'] = undefined;

/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
RankedTableTemplateData.prototype['fdc3Context'] = undefined;

/**
 * @member {module:model/RankedTable} table
 */
RankedTableTemplateData.prototype['table'] = undefined;


// Implement Template interface:
/**
 * @member {String} headline
 */
Template.prototype['headline'] = undefined;
/**
 * @member {String} footer
 */
Template.prototype['footer'] = undefined;
/**
 * @member {module:model/Fdc3Context} fdc3Context
 */
Template.prototype['fdc3Context'] = undefined;
// Implement RankedTableTemplateDataAllOf interface:
/**
 * @member {module:model/RankedTable} table
 */
RankedTableTemplateDataAllOf.prototype['table'] = undefined;




export default RankedTableTemplateData;

