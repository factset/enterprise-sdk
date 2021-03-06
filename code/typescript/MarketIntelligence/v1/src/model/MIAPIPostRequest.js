/**
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PostRequestExample from './PostRequestExample';

/**
 * The MIAPIPostRequest model module.
 * @module model/MIAPIPostRequest
 */
class MIAPIPostRequest {
    /**
     * Constructs a new <code>MIAPIPostRequest</code>.
     * Post request allows users to pass the necessary parameters such as the report name, identifier, id type, time zone, and report content.
     * @alias module:model/MIAPIPostRequest
     */
    constructor() { 
        
        MIAPIPostRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MIAPIPostRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MIAPIPostRequest} obj Optional instance to populate.
     * @return {module:model/MIAPIPostRequest} The populated <code>MIAPIPostRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MIAPIPostRequest();

            if (data.hasOwnProperty('report_name')) {
                obj['report_name'] = ApiClient.convertToType(data['report_name'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('id_type')) {
                obj['id_type'] = ApiClient.convertToType(data['id_type'], 'String');
            }
            if (data.hasOwnProperty('time_zone')) {
                obj['time_zone'] = ApiClient.convertToType(data['time_zone'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], [PostRequestExample]);
            }
        }
        return obj;
    }


}

/**
 * report name
 * @member {String} report_name
 */
MIAPIPostRequest.prototype['report_name'] = undefined;

/**
 * Index or portfolio for which the report to be created.
 * @member {String} identifier
 */
MIAPIPostRequest.prototype['identifier'] = undefined;

/**
 * identifier type
 * @member {String} id_type
 */
MIAPIPostRequest.prototype['id_type'] = undefined;

/**
 * Time zone for the report (this shall be utilized if a user wants to use the report via API and also from Workstation/web).
 * @member {String} time_zone
 */
MIAPIPostRequest.prototype['time_zone'] = undefined;

/**
 * @member {Array.<module:model/PostRequestExample>} content
 */
MIAPIPostRequest.prototype['content'] = undefined;






export default MIAPIPostRequest;

