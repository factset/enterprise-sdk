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

/**
 * The ErrorLink model module.
 * @module model/ErrorLink
 */
class ErrorLink {
    /**
     * Constructs a new <code>ErrorLink</code>.
     * @alias module:model/ErrorLink
     * @param about {String} 
     */
    constructor(about) { 
        
        ErrorLink.initialize(this, about);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, about) { 
        obj['about'] = about;
    }

    /**
     * Constructs a <code>ErrorLink</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorLink} obj Optional instance to populate.
     * @return {module:model/ErrorLink} The populated <code>ErrorLink</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorLink();

            if (data.hasOwnProperty('about')) {
                obj['about'] = ApiClient.convertToType(data['about'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} about
 */
ErrorLink.prototype['about'] = undefined;






export default ErrorLink;

