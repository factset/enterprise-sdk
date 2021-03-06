/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorObject from './ErrorObject';

/**
 * The ResourceStatusResponseData model module.
 * @module model/ResourceStatusResponseData
 */
class ResourceStatusResponseData {
    /**
     * Constructs a new <code>ResourceStatusResponseData</code>.
     * @alias module:model/ResourceStatusResponseData
     */
    constructor() { 
        
        ResourceStatusResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResourceStatusResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResourceStatusResponseData} obj Optional instance to populate.
     * @return {module:model/ResourceStatusResponseData} The populated <code>ResourceStatusResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResourceStatusResponseData();

            if (data.hasOwnProperty('error')) {
                obj['error'] = ErrorObject.constructFromObject(data['error']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ErrorObject} error
 */
ResourceStatusResponseData.prototype['error'] = undefined;

/**
 * ID of the submitted calculation job
 * @member {String} id
 */
ResourceStatusResponseData.prototype['id'] = undefined;

/**
 * Current status of the calculation job
 * @member {String} status
 */
ResourceStatusResponseData.prototype['status'] = undefined;






export default ResourceStatusResponseData;

