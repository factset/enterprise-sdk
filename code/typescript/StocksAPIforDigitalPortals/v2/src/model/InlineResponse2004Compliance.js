/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2004ComplianceFrance from './InlineResponse2004ComplianceFrance';

/**
 * The InlineResponse2004Compliance model module.
 * @module model/InlineResponse2004Compliance
 */
class InlineResponse2004Compliance {
    /**
     * Constructs a new <code>InlineResponse2004Compliance</code>.
     * Compliance properties. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes). 
     * @alias module:model/InlineResponse2004Compliance
     */
    constructor() { 
        
        InlineResponse2004Compliance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Compliance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Compliance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Compliance} The populated <code>InlineResponse2004Compliance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Compliance();

            if (data.hasOwnProperty('france')) {
                obj['france'] = ApiClient.convertToType(data['france'], [InlineResponse2004ComplianceFrance]);
            }
        }
        return obj;
    }


}

/**
 * List of compliance properties in accordance with the French law to which the stock is compliant.
 * @member {Array.<module:model/InlineResponse2004ComplianceFrance>} france
 */
InlineResponse2004Compliance.prototype['france'] = undefined;






export default InlineResponse2004Compliance;

