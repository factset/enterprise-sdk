/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CorporateAction from './CorporateAction';

/**
 * The CorporateActionsResponse model module.
 * @module model/CorporateActionsResponse
 */
class CorporateActionsResponse {
    /**
     * Constructs a new <code>CorporateActionsResponse</code>.
     * @alias module:model/CorporateActionsResponse
     */
    constructor() { 
        
        CorporateActionsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CorporateActionsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CorporateActionsResponse} obj Optional instance to populate.
     * @return {module:model/CorporateActionsResponse} The populated <code>CorporateActionsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CorporateActionsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [CorporateAction]);
            }
        }
        return obj;
    }


}

/**
 * Array of Corporate Action Objects
 * @member {Array.<module:model/CorporateAction>} data
 */
CorporateActionsResponse.prototype['data'] = undefined;






export default CorporateActionsResponse;

