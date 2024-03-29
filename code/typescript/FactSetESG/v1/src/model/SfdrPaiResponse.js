/**
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SfdrPai from './SfdrPai';

/**
 * The SfdrPaiResponse model module.
 * @module model/SfdrPaiResponse
 */
class SfdrPaiResponse {
    /**
     * Constructs a new <code>SfdrPaiResponse</code>.
     * @alias module:model/SfdrPaiResponse
     */
    constructor() { 
        
        SfdrPaiResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SfdrPaiResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SfdrPaiResponse} obj Optional instance to populate.
     * @return {module:model/SfdrPaiResponse} The populated <code>SfdrPaiResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SfdrPaiResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SfdrPai]);
            }
        }
        return obj;
    }


}

/**
 * Array of SFDR PAI Response object
 * @member {Array.<module:model/SfdrPai>} data
 */
SfdrPaiResponse.prototype['data'] = undefined;






export default SfdrPaiResponse;

