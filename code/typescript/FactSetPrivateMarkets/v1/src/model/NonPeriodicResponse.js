/**
 * FactSet Private Markets API
 * FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NonPeriodic from './NonPeriodic';

/**
 * The NonPeriodicResponse model module.
 * @module model/NonPeriodicResponse
 */
class NonPeriodicResponse {
    /**
     * Constructs a new <code>NonPeriodicResponse</code>.
     * @alias module:model/NonPeriodicResponse
     */
    constructor() { 
        
        NonPeriodicResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NonPeriodicResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NonPeriodicResponse} obj Optional instance to populate.
     * @return {module:model/NonPeriodicResponse} The populated <code>NonPeriodicResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NonPeriodicResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [NonPeriodic]);
            }
        }
        return obj;
    }


}

/**
 * Array of Private Company Non-Periodic objects.
 * @member {Array.<module:model/NonPeriodic>} data
 */
NonPeriodicResponse.prototype['data'] = undefined;






export default NonPeriodicResponse;

