/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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

/**
 * The ErrorResponseSubErrors model module.
 * @module model/ErrorResponseSubErrors
 */
class ErrorResponseSubErrors {
    /**
     * Constructs a new <code>ErrorResponseSubErrors</code>.
     * subErrors related to the error message. Null if not applicable.
     * @alias module:model/ErrorResponseSubErrors
     */
    constructor() { 
        
        ErrorResponseSubErrors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorResponseSubErrors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorResponseSubErrors} obj Optional instance to populate.
     * @return {module:model/ErrorResponseSubErrors} The populated <code>ErrorResponseSubErrors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorResponseSubErrors();

            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('field')) {
                obj['field'] = ApiClient.convertToType(data['field'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('rejectedValue')) {
                obj['rejectedValue'] = ApiClient.convertToType(data['rejectedValue'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * the operation ID
 * @member {String} object
 */
ErrorResponseSubErrors.prototype['object'] = undefined;

/**
 * Parameter Field Name
 * @member {String} field
 */
ErrorResponseSubErrors.prototype['field'] = undefined;

/**
 * Error message
 * @member {String} message
 */
ErrorResponseSubErrors.prototype['message'] = undefined;

/**
 * Rejected Values in an Array
 * @member {Array.<String>} rejectedValue
 */
ErrorResponseSubErrors.prototype['rejectedValue'] = undefined;






export default ErrorResponseSubErrors;

