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
import EntityMatch from './EntityMatch';

/**
 * The EntityMatchesResponse model module.
 * @module model/EntityMatchesResponse
 */
class EntityMatchesResponse {
    /**
     * Constructs a new <code>EntityMatchesResponse</code>.
     * Response object for Entity Matches.
     * @alias module:model/EntityMatchesResponse
     */
    constructor() { 
        
        EntityMatchesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityMatchesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMatchesResponse} obj Optional instance to populate.
     * @return {module:model/EntityMatchesResponse} The populated <code>EntityMatchesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMatchesResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [EntityMatch]);
            }
        }
        return obj;
    }


}

/**
 * Candidate list of `Entity Match` objects.
 * @member {Array.<module:model/EntityMatch>} data
 */
EntityMatchesResponse.prototype['data'] = undefined;






export default EntityMatchesResponse;

