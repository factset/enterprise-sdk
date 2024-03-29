/**
 * Security-Modeling API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import OneOfFieldsFields from './OneOfFieldsFields';
import SMError from './SMError';

/**
 * The SMRetrieveResponse model module.
 * @module model/SMRetrieveResponse
 */
class SMRetrieveResponse {
    /**
     * Constructs a new <code>SMRetrieveResponse</code>.
     * @alias module:model/SMRetrieveResponse
     */
    constructor() { 
        
        SMRetrieveResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SMRetrieveResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SMRetrieveResponse} obj Optional instance to populate.
     * @return {module:model/SMRetrieveResponse} The populated <code>SMRetrieveResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SMRetrieveResponse();

            if (data.hasOwnProperty('securityName')) {
                obj['securityName'] = ApiClient.convertToType(data['securityName'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = ApiClient.convertToType(data['location'], 'String');
            }
            if (data.hasOwnProperty('asofdate')) {
                obj['asofdate'] = ApiClient.convertToType(data['asofdate'], 'String');
            }
            if (data.hasOwnProperty('fields')) {
                obj['fields'] = OneOfFieldsFields.constructFromObject(data['fields']);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [SMError]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} securityName
 */
SMRetrieveResponse.prototype['securityName'] = undefined;

/**
 * @member {module:model/SMRetrieveResponse.StatusEnum} status
 */
SMRetrieveResponse.prototype['status'] = undefined;

/**
 * @member {String} location
 */
SMRetrieveResponse.prototype['location'] = undefined;

/**
 * @member {String} asofdate
 */
SMRetrieveResponse.prototype['asofdate'] = undefined;

/**
 * @member {module:model/OneOfFieldsFields} fields
 */
SMRetrieveResponse.prototype['fields'] = undefined;

/**
 * @member {Array.<module:model/SMError>} errors
 */
SMRetrieveResponse.prototype['errors'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
SMRetrieveResponse['StatusEnum'] = {

    /**
     * value: "success"
     * @const
     */
    "success": "success",

    /**
     * value: "failure"
     * @const
     */
    "failure": "failure"
};



export default SMRetrieveResponse;

