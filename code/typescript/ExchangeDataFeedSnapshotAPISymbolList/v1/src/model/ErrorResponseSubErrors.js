/**
 * Exchange DataFeed Snapshot
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 300 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
 *
 * The version of the OpenAPI document: 1.0.0
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

            if (data.hasOwnProperty('field')) {
                obj['field'] = ApiClient.convertToType(data['field'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

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






export default ErrorResponseSubErrors;

