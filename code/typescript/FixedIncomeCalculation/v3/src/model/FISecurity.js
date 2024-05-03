/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FIAttributionForSecurities from './FIAttributionForSecurities';
import FIBankLoans from './FIBankLoans';
import FIConvertibleSettings from './FIConvertibleSettings';
import FILoss from './FILoss';
import FIMunicipalBonds from './FIMunicipalBonds';
import FIPrepay from './FIPrepay';
import FIReferenceSecurity from './FIReferenceSecurity';
import FIStructuredProductsForSecurities from './FIStructuredProductsForSecurities';

/**
 * The FISecurity model module.
 * @module model/FISecurity
 */
class FISecurity {
    /**
     * Constructs a new <code>FISecurity</code>.
     * @alias module:model/FISecurity
     * @param calcFromValue {Number} Calculation from value
     * @param symbol {String} Symbol
     */
    constructor(calcFromValue, symbol) { 
        
        FISecurity.initialize(this, calcFromValue, symbol);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, calcFromValue, symbol) { 
        obj['calcFromValue'] = calcFromValue;
        obj['symbol'] = symbol;
    }

    /**
     * Constructs a <code>FISecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FISecurity} obj Optional instance to populate.
     * @return {module:model/FISecurity} The populated <code>FISecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FISecurity();

            if (data.hasOwnProperty('settlement')) {
                obj['settlement'] = ApiClient.convertToType(data['settlement'], 'String');
            }
            if (data.hasOwnProperty('callMethod')) {
                obj['callMethod'] = ApiClient.convertToType(data['callMethod'], 'String');
            }
            if (data.hasOwnProperty('referenceSecurity')) {
                obj['referenceSecurity'] = FIReferenceSecurity.constructFromObject(data['referenceSecurity']);
            }
            if (data.hasOwnProperty('bankLoans')) {
                obj['bankLoans'] = FIBankLoans.constructFromObject(data['bankLoans']);
            }
            if (data.hasOwnProperty('municipalBonds')) {
                obj['municipalBonds'] = FIMunicipalBonds.constructFromObject(data['municipalBonds']);
            }
            if (data.hasOwnProperty('loss')) {
                obj['loss'] = FILoss.constructFromObject(data['loss']);
            }
            if (data.hasOwnProperty('prepay')) {
                obj['prepay'] = FIPrepay.constructFromObject(data['prepay']);
            }
            if (data.hasOwnProperty('matrixSpreadAdjustment')) {
                obj['matrixSpreadAdjustment'] = ApiClient.convertToType(data['matrixSpreadAdjustment'], 'Number');
            }
            if (data.hasOwnProperty('matrixMultiplier')) {
                obj['matrixMultiplier'] = ApiClient.convertToType(data['matrixMultiplier'], 'Number');
            }
            if (data.hasOwnProperty('structuredProducts')) {
                obj['structuredProducts'] = FIStructuredProductsForSecurities.constructFromObject(data['structuredProducts']);
            }
            if (data.hasOwnProperty('attribution')) {
                obj['attribution'] = FIAttributionForSecurities.constructFromObject(data['attribution']);
            }
            if (data.hasOwnProperty('convertible')) {
                obj['convertible'] = FIConvertibleSettings.constructFromObject(data['convertible']);
            }
            if (data.hasOwnProperty('calcFromMethod')) {
                obj['calcFromMethod'] = ApiClient.convertToType(data['calcFromMethod'], 'String');
            }
            if (data.hasOwnProperty('calcFromValue')) {
                obj['calcFromValue'] = ApiClient.convertToType(data['calcFromValue'], 'Number');
            }
            if (data.hasOwnProperty('face')) {
                obj['face'] = ApiClient.convertToType(data['face'], 'Number');
            }
            if (data.hasOwnProperty('faceType')) {
                obj['faceType'] = ApiClient.convertToType(data['faceType'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('discountCurve')) {
                obj['discountCurve'] = ApiClient.convertToType(data['discountCurve'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Settlement date
 * @member {String} settlement
 */
FISecurity.prototype['settlement'] = undefined;

/**
 * Call Method
 * @member {module:model/FISecurity.CallMethodEnum} callMethod
 */
FISecurity.prototype['callMethod'] = undefined;

/**
 * @member {module:model/FIReferenceSecurity} referenceSecurity
 */
FISecurity.prototype['referenceSecurity'] = undefined;

/**
 * @member {module:model/FIBankLoans} bankLoans
 */
FISecurity.prototype['bankLoans'] = undefined;

/**
 * @member {module:model/FIMunicipalBonds} municipalBonds
 */
FISecurity.prototype['municipalBonds'] = undefined;

/**
 * @member {module:model/FILoss} loss
 */
FISecurity.prototype['loss'] = undefined;

/**
 * @member {module:model/FIPrepay} prepay
 */
FISecurity.prototype['prepay'] = undefined;

/**
 * Matrix Spread Adjustment
 * @member {Number} matrixSpreadAdjustment
 */
FISecurity.prototype['matrixSpreadAdjustment'] = undefined;

/**
 * Matrix Multiplier
 * @member {Number} matrixMultiplier
 */
FISecurity.prototype['matrixMultiplier'] = undefined;

/**
 * @member {module:model/FIStructuredProductsForSecurities} structuredProducts
 */
FISecurity.prototype['structuredProducts'] = undefined;

/**
 * @member {module:model/FIAttributionForSecurities} attribution
 */
FISecurity.prototype['attribution'] = undefined;

/**
 * @member {module:model/FIConvertibleSettings} convertible
 */
FISecurity.prototype['convertible'] = undefined;

/**
 * Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix
 * @member {String} calcFromMethod
 */
FISecurity.prototype['calcFromMethod'] = undefined;

/**
 * Calculation from value
 * @member {Number} calcFromValue
 */
FISecurity.prototype['calcFromValue'] = undefined;

/**
 * Face
 * @member {Number} face
 * @default 1
 */
FISecurity.prototype['face'] = 1;

/**
 * Face type
 * @member {module:model/FISecurity.FaceTypeEnum} faceType
 * @default 'Current'
 */
FISecurity.prototype['faceType'] = 'Current';

/**
 * Symbol
 * @member {String} symbol
 */
FISecurity.prototype['symbol'] = undefined;

/**
 * Discount curve
 * @member {String} discountCurve
 */
FISecurity.prototype['discountCurve'] = undefined;





/**
 * Allowed values for the <code>callMethod</code> property.
 * @enum {String}
 * @readonly
 */
FISecurity['CallMethodEnum'] = {

    /**
     * value: "No Call"
     * @const
     */
    "No Call": "No Call",

    /**
     * value: "Intrinsic Value"
     * @const
     */
    "Intrinsic Value": "Intrinsic Value",

    /**
     * value: "First Call"
     * @const
     */
    "First Call": "First Call",

    /**
     * value: "First Par"
     * @const
     */
    "First Par": "First Par"
};


/**
 * Allowed values for the <code>faceType</code> property.
 * @enum {String}
 * @readonly
 */
FISecurity['FaceTypeEnum'] = {

    /**
     * value: "Current"
     * @const
     */
    "Current": "Current",

    /**
     * value: "Original"
     * @const
     */
    "Original": "Original"
};



export default FISecurity;

