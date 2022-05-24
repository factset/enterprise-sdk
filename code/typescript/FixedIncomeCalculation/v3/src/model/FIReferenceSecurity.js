/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FIReferencePrepay from './FIReferencePrepay';

/**
 * The FIReferenceSecurity model module.
 * @module model/FIReferenceSecurity
 * @version 0.20.0
 */
class FIReferenceSecurity {
    /**
     * Constructs a new <code>FIReferenceSecurity</code>.
     * @alias module:model/FIReferenceSecurity
     */
    constructor() { 
        
        FIReferenceSecurity.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIReferenceSecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIReferenceSecurity} obj Optional instance to populate.
     * @return {module:model/FIReferenceSecurity} The populated <code>FIReferenceSecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIReferenceSecurity();

            if (data.hasOwnProperty('securityType')) {
                obj['securityType'] = ApiClient.convertToType(data['securityType'], 'String');
            }
            if (data.hasOwnProperty('securityName')) {
                obj['securityName'] = ApiClient.convertToType(data['securityName'], 'String');
            }
            if (data.hasOwnProperty('calcFromMethod')) {
                obj['calcFromMethod'] = ApiClient.convertToType(data['calcFromMethod'], 'String');
            }
            if (data.hasOwnProperty('calcFromValue')) {
                obj['calcFromValue'] = ApiClient.convertToType(data['calcFromValue'], 'Number');
            }
            if (data.hasOwnProperty('prepay')) {
                obj['prepay'] = FIReferencePrepay.constructFromObject(data['prepay']);
            }
            if (data.hasOwnProperty('settlement')) {
                obj['settlement'] = ApiClient.convertToType(data['settlement'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Reference Security Type
 * @member {String} securityType
 */
FIReferenceSecurity.prototype['securityType'] = undefined;

/**
 * Reference Security Name
 * @member {String} securityName
 */
FIReferenceSecurity.prototype['securityName'] = undefined;

/**
 * Reference Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix
 * @member {String} calcFromMethod
 */
FIReferenceSecurity.prototype['calcFromMethod'] = undefined;

/**
 * Reference CalcFromValue
 * @member {Number} calcFromValue
 */
FIReferenceSecurity.prototype['calcFromValue'] = undefined;

/**
 * @member {module:model/FIReferencePrepay} prepay
 */
FIReferenceSecurity.prototype['prepay'] = undefined;

/**
 * Reference Settlement Date
 * @member {String} settlement
 */
FIReferenceSecurity.prototype['settlement'] = undefined;






export default FIReferenceSecurity;
