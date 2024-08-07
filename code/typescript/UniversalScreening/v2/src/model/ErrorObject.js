/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorCode from './ErrorCode';
import ErrorObjectSource from './ErrorObjectSource';

/**
 * The ErrorObject model module.
 * @module model/ErrorObject
 */
class ErrorObject {
    /**
     * Constructs a new <code>ErrorObject</code>.
     * Associated Error Objects
     * @alias module:model/ErrorObject
     */
    constructor() { 
        
        ErrorObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorObject} obj Optional instance to populate.
     * @return {module:model/ErrorObject} The populated <code>ErrorObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorObject();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ErrorCode.constructFromObject(data['code']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ErrorObjectSource.constructFromObject(data['source']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ErrorCode} code
 */
ErrorObject.prototype['code'] = undefined;

/**
 * A unique ID for the occurrence of the error. It is advised to log this code and include it if you contact FactSet support desk.
 * @member {String} id
 */
ErrorObject.prototype['id'] = undefined;

/**
 * @member {module:model/ErrorObjectSource} source
 */
ErrorObject.prototype['source'] = undefined;

/**
 * A description of the error
 * @member {String} title
 */
ErrorObject.prototype['title'] = undefined;






export default ErrorObject;

