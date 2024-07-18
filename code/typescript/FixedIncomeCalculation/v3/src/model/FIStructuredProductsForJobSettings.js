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
import FIBalloonExtension from './FIBalloonExtension';
import FICashflows from './FICashflows';
import FIPrepayLockout from './FIPrepayLockout';
import FIServicerAdvances from './FIServicerAdvances';

/**
 * The FIStructuredProductsForJobSettings model module.
 * @module model/FIStructuredProductsForJobSettings
 */
class FIStructuredProductsForJobSettings {
    /**
     * Constructs a new <code>FIStructuredProductsForJobSettings</code>.
     * @alias module:model/FIStructuredProductsForJobSettings
     */
    constructor() { 
        
        FIStructuredProductsForJobSettings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIStructuredProductsForJobSettings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIStructuredProductsForJobSettings} obj Optional instance to populate.
     * @return {module:model/FIStructuredProductsForJobSettings} The populated <code>FIStructuredProductsForJobSettings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIStructuredProductsForJobSettings();

            if (data.hasOwnProperty('servicerAdvances')) {
                obj['servicerAdvances'] = FIServicerAdvances.constructFromObject(data['servicerAdvances']);
            }
            if (data.hasOwnProperty('ignoreFinancialGuarantee')) {
                obj['ignoreFinancialGuarantee'] = ApiClient.convertToType(data['ignoreFinancialGuarantee'], 'String');
            }
            if (data.hasOwnProperty('cleanUpCallMethod')) {
                obj['cleanUpCallMethod'] = ApiClient.convertToType(data['cleanUpCallMethod'], 'Boolean');
            }
            if (data.hasOwnProperty('doOPTRedeem')) {
                obj['doOPTRedeem'] = ApiClient.convertToType(data['doOPTRedeem'], 'String');
            }
            if (data.hasOwnProperty('prepayLockout')) {
                obj['prepayLockout'] = FIPrepayLockout.constructFromObject(data['prepayLockout']);
            }
            if (data.hasOwnProperty('cashflows')) {
                obj['cashflows'] = FICashflows.constructFromObject(data['cashflows']);
            }
            if (data.hasOwnProperty('balloonExtension')) {
                obj['balloonExtension'] = FIBalloonExtension.constructFromObject(data['balloonExtension']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FIServicerAdvances} servicerAdvances
 */
FIStructuredProductsForJobSettings.prototype['servicerAdvances'] = undefined;

/**
 * Ignore Financial Guarantee
 * @member {String} ignoreFinancialGuarantee
 */
FIStructuredProductsForJobSettings.prototype['ignoreFinancialGuarantee'] = undefined;

/**
 * Cleanup Call Method
 * @member {Boolean} cleanUpCallMethod
 */
FIStructuredProductsForJobSettings.prototype['cleanUpCallMethod'] = undefined;

/**
 * Do OPT Redeem
 * @member {String} doOPTRedeem
 */
FIStructuredProductsForJobSettings.prototype['doOPTRedeem'] = undefined;

/**
 * @member {module:model/FIPrepayLockout} prepayLockout
 */
FIStructuredProductsForJobSettings.prototype['prepayLockout'] = undefined;

/**
 * @member {module:model/FICashflows} cashflows
 */
FIStructuredProductsForJobSettings.prototype['cashflows'] = undefined;

/**
 * @member {module:model/FIBalloonExtension} balloonExtension
 */
FIStructuredProductsForJobSettings.prototype['balloonExtension'] = undefined;






export default FIStructuredProductsForJobSettings;

