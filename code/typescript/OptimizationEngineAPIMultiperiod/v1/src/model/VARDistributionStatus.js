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
import VARStatusIndicator from './VARStatusIndicator';

/**
 * The VARDistributionStatus model module.
 * @module model/VARDistributionStatus
 */
class VARDistributionStatus {
    /**
     * Constructs a new <code>VARDistributionStatus</code>.
     * @alias module:model/VARDistributionStatus
     */
    constructor() { 
        
        VARDistributionStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VARDistributionStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VARDistributionStatus} obj Optional instance to populate.
     * @return {module:model/VARDistributionStatus} The populated <code>VARDistributionStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VARDistributionStatus();

            if (data.hasOwnProperty('indicator')) {
                obj['indicator'] = VARStatusIndicator.constructFromObject(data['indicator']);
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/VARStatusIndicator} indicator
 */
VARDistributionStatus.prototype['indicator'] = undefined;

/**
 * @member {String} message
 */
VARDistributionStatus.prototype['message'] = undefined;






export default VARDistributionStatus;

