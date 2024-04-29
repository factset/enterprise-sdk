/**
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Spotlights model module.
 * @module model/Spotlights
 */
class Spotlights {
    /**
     * Constructs a new <code>Spotlights</code>.
     * @alias module:model/Spotlights
     * @extends Object
     * @param date {Date} Ending date for the period requested expressed in YYYY-MM-DD format.
     * @param fsymId {String} FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
     * @param requestId {String} Identifier that was used for the request.
     */
    constructor(date, fsymId, requestId) { 
        
        Spotlights.initialize(this, date, fsymId, requestId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, date, fsymId, requestId) { 
        obj['date'] = date;
        obj['fsymId'] = fsymId;
        obj['requestId'] = requestId;
    }

    /**
     * Constructs a <code>Spotlights</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Spotlights} obj Optional instance to populate.
     * @return {module:model/Spotlights} The populated <code>Spotlights</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Spotlights();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Ending date for the period requested expressed in YYYY-MM-DD format.
 * @member {Date} date
 */
Spotlights.prototype['date'] = undefined;

/**
 * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
 * @member {String} fsymId
 */
Spotlights.prototype['fsymId'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Spotlights.prototype['requestId'] = undefined;






export default Spotlights;

