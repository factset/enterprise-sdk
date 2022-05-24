/**
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OptimizerInputsQuantRiskRequestInfo model module.
 * @module model/OptimizerInputsQuantRiskRequestInfo
 * @version 0.20.0
 */
class OptimizerInputsQuantRiskRequestInfo {
    /**
     * Constructs a new <code>OptimizerInputsQuantRiskRequestInfo</code>.
     * @alias module:model/OptimizerInputsQuantRiskRequestInfo
     */
    constructor() { 
        
        OptimizerInputsQuantRiskRequestInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsQuantRiskRequestInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsQuantRiskRequestInfo} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsQuantRiskRequestInfo} The populated <code>OptimizerInputsQuantRiskRequestInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsQuantRiskRequestInfo();

            if (data.hasOwnProperty('service_url')) {
                obj['service_url'] = ApiClient.convertToType(data['service_url'], 'String');
            }
            if (data.hasOwnProperty('json_post_body')) {
                obj['json_post_body'] = ApiClient.convertToType(data['json_post_body'], 'String');
            }
            if (data.hasOwnProperty('lima_header')) {
                obj['lima_header'] = ApiClient.convertToType(data['lima_header'], 'String');
            }
            if (data.hasOwnProperty('pickup_base_url')) {
                obj['pickup_base_url'] = ApiClient.convertToType(data['pickup_base_url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * POST
 * @member {String} service_url
 */
OptimizerInputsQuantRiskRequestInfo.prototype['service_url'] = undefined;

/**
 * @member {String} json_post_body
 */
OptimizerInputsQuantRiskRequestInfo.prototype['json_post_body'] = undefined;

/**
 * @member {String} lima_header
 */
OptimizerInputsQuantRiskRequestInfo.prototype['lima_header'] = undefined;

/**
 * @member {String} pickup_base_url
 */
OptimizerInputsQuantRiskRequestInfo.prototype['pickup_base_url'] = undefined;






export default OptimizerInputsQuantRiskRequestInfo;
