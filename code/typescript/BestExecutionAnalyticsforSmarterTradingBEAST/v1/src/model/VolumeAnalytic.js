/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
 * The VolumeAnalytic model module.
 * @module model/VolumeAnalytic
 */
class VolumeAnalytic {
    /**
     * Constructs a new <code>VolumeAnalytic</code>.
     * Volume Analytic object
     * @alias module:model/VolumeAnalytic
     */
    constructor() { 
        
        VolumeAnalytic.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VolumeAnalytic</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VolumeAnalytic} obj Optional instance to populate.
     * @return {module:model/VolumeAnalytic} The populated <code>VolumeAnalytic</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VolumeAnalytic();

            if (data.hasOwnProperty('dateId')) {
                obj['dateId'] = ApiClient.convertToType(data['dateId'], 'String');
            }
            if (data.hasOwnProperty('bidSideVolume')) {
                obj['bidSideVolume'] = ApiClient.convertToType(data['bidSideVolume'], 'Number');
            }
            if (data.hasOwnProperty('askSideVolume')) {
                obj['askSideVolume'] = ApiClient.convertToType(data['askSideVolume'], 'Number');
            }
            if (data.hasOwnProperty('blockVolume')) {
                obj['blockVolume'] = ApiClient.convertToType(data['blockVolume'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date Id
 * @member {String} dateId
 */
VolumeAnalytic.prototype['dateId'] = undefined;

/**
 * Bid Side Volume
 * @member {Number} bidSideVolume
 */
VolumeAnalytic.prototype['bidSideVolume'] = undefined;

/**
 * Ask Side Volume
 * @member {Number} askSideVolume
 */
VolumeAnalytic.prototype['askSideVolume'] = undefined;

/**
 * Block Volume
 * @member {Number} blockVolume
 */
VolumeAnalytic.prototype['blockVolume'] = undefined;






export default VolumeAnalytic;

