/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIPrepayLockout model module.
 * @module model/FIPrepayLockout
 */
class FIPrepayLockout {
    /**
     * Constructs a new <code>FIPrepayLockout</code>.
     * @alias module:model/FIPrepayLockout
     */
    constructor() { 
        
        FIPrepayLockout.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIPrepayLockout</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIPrepayLockout} obj Optional instance to populate.
     * @return {module:model/FIPrepayLockout} The populated <code>FIPrepayLockout</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIPrepayLockout();

            if (data.hasOwnProperty('pointsAbove')) {
                obj['pointsAbove'] = ApiClient.convertToType(data['pointsAbove'], 'String');
            }
            if (data.hasOwnProperty('ymAbove')) {
                obj['ymAbove'] = ApiClient.convertToType(data['ymAbove'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Points Above
 * @member {module:model/FIPrepayLockout.PointsAboveEnum} pointsAbove
 */
FIPrepayLockout.prototype['pointsAbove'] = undefined;

/**
 * Ym Above
 * @member {module:model/FIPrepayLockout.YmAboveEnum} ymAbove
 */
FIPrepayLockout.prototype['ymAbove'] = undefined;





/**
 * Allowed values for the <code>pointsAbove</code> property.
 * @enum {String}
 * @readonly
 */
FIPrepayLockout['PointsAboveEnum'] = {

    /**
     * value: "ANY"
     * @const
     */
    "ANY": "ANY",

    /**
     * value: "NO_LOCKOUT"
     * @const
     */
    "NO_LOCKOUT": "NO_LOCKOUT",

    /**
     * value: "NUMERIC"
     * @const
     */
    "NUMERIC": "NUMERIC"
};


/**
 * Allowed values for the <code>ymAbove</code> property.
 * @enum {String}
 * @readonly
 */
FIPrepayLockout['YmAboveEnum'] = {

    /**
     * value: "ANY"
     * @const
     */
    "ANY": "ANY",

    /**
     * value: "NO_LOCKOUT"
     * @const
     */
    "NO_LOCKOUT": "NO_LOCKOUT",

    /**
     * value: "NUMERIC"
     * @const
     */
    "NUMERIC": "NUMERIC"
};



export default FIPrepayLockout;

