/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ReportInstanceId from './ReportInstanceId';

/**
 * The ReportInstanceDataResponse model module.
 * @module model/ReportInstanceDataResponse
 * @version 0.9.0
 */
class ReportInstanceDataResponse {
    /**
     * Constructs a new <code>ReportInstanceDataResponse</code>.
     * @alias module:model/ReportInstanceDataResponse
     */
    constructor() { 
        
        ReportInstanceDataResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportInstanceDataResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportInstanceDataResponse} obj Optional instance to populate.
     * @return {module:model/ReportInstanceDataResponse} The populated <code>ReportInstanceDataResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportInstanceDataResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ReportInstanceId.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ReportInstanceId} data
 */
ReportInstanceDataResponse.prototype['data'] = undefined;






export default ReportInstanceDataResponse;
