/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20066DataValueUnit model module.
 * @module model/InlineResponse20066DataValueUnit
 */
class InlineResponse20066DataValueUnit {
    /**
     * Constructs a new <code>InlineResponse20066DataValueUnit</code>.
     * Value unit of the notation. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values.
     * @alias module:model/InlineResponse20066DataValueUnit
     */
    constructor() { 
        
        InlineResponse20066DataValueUnit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20066DataValueUnit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20066DataValueUnit} obj Optional instance to populate.
     * @return {module:model/InlineResponse20066DataValueUnit} The populated <code>InlineResponse20066DataValueUnit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20066DataValueUnit();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('isoCode')) {
                obj['isoCode'] = ApiClient.convertToType(data['isoCode'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the value unit.
 * @member {Number} id
 */
InlineResponse20066DataValueUnit.prototype['id'] = undefined;

/**
 * Code of the value unit: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency; or a code such as PT (points) for non-currency value units.
 * @member {String} code
 */
InlineResponse20066DataValueUnit.prototype['code'] = undefined;

/**
 * ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency.
 * @member {String} isoCode
 */
InlineResponse20066DataValueUnit.prototype['isoCode'] = undefined;

/**
 * Name of the value unit.
 * @member {String} name
 */
InlineResponse20066DataValueUnit.prototype['name'] = undefined;






export default InlineResponse20066DataValueUnit;

