/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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
 * The SummariesRequest model module.
 * @module model/SummariesRequest
 */
class SummariesRequest {
    /**
     * Constructs a new <code>SummariesRequest</code>.
     * Summaries Request Body
     * @alias module:model/SummariesRequest
     * @param ids {Array.<String>} The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> 
     */
    constructor(ids) { 
        
        SummariesRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>SummariesRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SummariesRequest} obj Optional instance to populate.
     * @return {module:model/SummariesRequest} The populated <code>SummariesRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SummariesRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> 
 * @member {Array.<String>} ids
 */
SummariesRequest.prototype['ids'] = undefined;






export default SummariesRequest;

