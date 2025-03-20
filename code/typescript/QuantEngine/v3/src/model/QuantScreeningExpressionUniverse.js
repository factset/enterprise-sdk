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
import QuantUniverse from './QuantUniverse';

/**
 * The QuantScreeningExpressionUniverse model module.
 * @module model/QuantScreeningExpressionUniverse
 */
class QuantScreeningExpressionUniverse {
    /**
     * Constructs a new <code>QuantScreeningExpressionUniverse</code>.
     * @alias module:model/QuantScreeningExpressionUniverse
     * @implements module:model/QuantUniverse
     * @param source {module:model/QuantScreeningExpressionUniverse.SourceEnum} 
     */
    constructor(source) { 
        QuantUniverse.initialize(this, source);
        QuantScreeningExpressionUniverse.initialize(this, source);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, source) { 
        obj['universeExpr'] = universeExpr;
        obj['universeType'] = universeType;
        obj['source'] = source;
    }

    /**
     * Constructs a <code>QuantScreeningExpressionUniverse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuantScreeningExpressionUniverse} obj Optional instance to populate.
     * @return {module:model/QuantScreeningExpressionUniverse} The populated <code>QuantScreeningExpressionUniverse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuantScreeningExpressionUniverse();
            QuantUniverse.constructFromObject(data, obj);

            if (data.hasOwnProperty('universeExpr')) {
                obj['universeExpr'] = ApiClient.convertToType(data['universeExpr'], 'String');
            }
            if (data.hasOwnProperty('universeType')) {
                obj['universeType'] = ApiClient.convertToType(data['universeType'], 'String');
            }
            if (data.hasOwnProperty('securityExpr')) {
                obj['securityExpr'] = ApiClient.convertToType(data['securityExpr'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} universeExpr
 */
QuantScreeningExpressionUniverse.prototype['universeExpr'] = undefined;

/**
 * @member {module:model/QuantScreeningExpressionUniverse.UniverseTypeEnum} universeType
 */
QuantScreeningExpressionUniverse.prototype['universeType'] = undefined;

/**
 * @member {String} securityExpr
 */
QuantScreeningExpressionUniverse.prototype['securityExpr'] = undefined;

/**
 * @member {module:model/QuantScreeningExpressionUniverse.SourceEnum} source
 */
QuantScreeningExpressionUniverse.prototype['source'] = undefined;


// Implement QuantUniverse interface:
/**
 * @member {module:model/QuantUniverse.SourceEnum} source
 */
QuantUniverse.prototype['source'] = undefined;



/**
 * Allowed values for the <code>universeType</code> property.
 * @enum {String}
 * @readonly
 */
QuantScreeningExpressionUniverse['UniverseTypeEnum'] = {

    /**
     * value: "Equity"
     * @const
     */
    "Equity": "Equity",

    /**
     * value: "Debt"
     * @const
     */
    "Debt": "Debt"
};


/**
 * Allowed values for the <code>source</code> property.
 * @enum {String}
 * @readonly
 */
QuantScreeningExpressionUniverse['SourceEnum'] = {

    /**
     * value: "ScreeningExpressionUniverse"
     * @const
     */
    "ScreeningExpressionUniverse": "ScreeningExpressionUniverse",

    /**
     * value: "UniversalScreenUniverse"
     * @const
     */
    "UniversalScreenUniverse": "UniversalScreenUniverse",

    /**
     * value: "IdentifierUniverse"
     * @const
     */
    "IdentifierUniverse": "IdentifierUniverse"
};



export default QuantScreeningExpressionUniverse;

