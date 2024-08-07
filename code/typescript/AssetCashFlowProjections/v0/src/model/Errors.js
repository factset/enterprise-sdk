/**
 * Asset Cash Flow Projections API
 * Allow clients to upload scenario files through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorSource from './ErrorSource';

/**
 * The Errors model module.
 * @module model/Errors
 */
class Errors {
    /**
     * Constructs a new <code>Errors</code>.
     * @alias module:model/Errors
     */
    constructor() { 
        
        Errors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Errors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Errors} obj Optional instance to populate.
     * @return {module:model/Errors} The populated <code>Errors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Errors();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ErrorSource.constructFromObject(data['source']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} code
 */
Errors.prototype['code'] = undefined;

/**
 * @member {String} detail
 */
Errors.prototype['detail'] = undefined;

/**
 * @member {String} id
 */
Errors.prototype['id'] = undefined;

/**
 * @member {module:model/ErrorSource} source
 */
Errors.prototype['source'] = undefined;

/**
 * @member {String} title
 */
Errors.prototype['title'] = undefined;






export default Errors;

