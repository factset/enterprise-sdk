/**
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import QuantFormula from './QuantFormula';

/**
 * The QuantFqlExpression model module.
 * @module model/QuantFqlExpression
 */
class QuantFqlExpression {
    /**
     * Constructs a new <code>QuantFqlExpression</code>.
     * @alias module:model/QuantFqlExpression
     * @implements module:model/QuantFormula
     * @param source {module:model/QuantFqlExpression.SourceEnum} 
     */
    constructor(source) { 
        QuantFormula.initialize(this, source);
        QuantFqlExpression.initialize(this, source);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, source) { 
        obj['expr'] = expr;
        obj['name'] = name;
        obj['source'] = source;
    }

    /**
     * Constructs a <code>QuantFqlExpression</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuantFqlExpression} obj Optional instance to populate.
     * @return {module:model/QuantFqlExpression} The populated <code>QuantFqlExpression</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuantFqlExpression();
            QuantFormula.constructFromObject(data, obj);

            if (data.hasOwnProperty('expr')) {
                obj['expr'] = ApiClient.convertToType(data['expr'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('dateOffset')) {
                obj['dateOffset'] = ApiClient.convertToType(data['dateOffset'], 'String');
            }
            if (data.hasOwnProperty('isArrayReturnType')) {
                obj['isArrayReturnType'] = ApiClient.convertToType(data['isArrayReturnType'], 'Boolean');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} expr
 */
QuantFqlExpression.prototype['expr'] = undefined;

/**
 * @member {String} name
 */
QuantFqlExpression.prototype['name'] = undefined;

/**
 * @member {String} dateOffset
 */
QuantFqlExpression.prototype['dateOffset'] = undefined;

/**
 * @member {Boolean} isArrayReturnType
 */
QuantFqlExpression.prototype['isArrayReturnType'] = undefined;

/**
 * @member {module:model/QuantFqlExpression.SourceEnum} source
 */
QuantFqlExpression.prototype['source'] = undefined;


// Implement QuantFormula interface:
/**
 * @member {module:model/QuantFormula.SourceEnum} source
 */
QuantFormula.prototype['source'] = undefined;



/**
 * Allowed values for the <code>source</code> property.
 * @enum {String}
 * @readonly
 */
QuantFqlExpression['SourceEnum'] = {

    /**
     * value: "ScreeningExpression"
     * @const
     */
    "ScreeningExpression": "ScreeningExpression",

    /**
     * value: "FqlExpression"
     * @const
     */
    "FqlExpression": "FqlExpression",

    /**
     * value: "UniversalScreenParameter"
     * @const
     */
    "UniversalScreenParameter": "UniversalScreenParameter",

    /**
     * value: "AllUniversalScreenParameters"
     * @const
     */
    "AllUniversalScreenParameters": "AllUniversalScreenParameters"
};



export default QuantFqlExpression;

