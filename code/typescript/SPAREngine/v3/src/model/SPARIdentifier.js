/**
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SPARIdentifier model module.
 * @module model/SPARIdentifier
 */
class SPARIdentifier {
    /**
     * Constructs a new <code>SPARIdentifier</code>.
     * The account/benchmark parameter for SPAR calculation.
     * @alias module:model/SPARIdentifier
     * @param id {String} User's FactSet account OR benchmark id.
     */
    constructor(id) { 
        
        SPARIdentifier.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>SPARIdentifier</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARIdentifier} obj Optional instance to populate.
     * @return {module:model/SPARIdentifier} The populated <code>SPARIdentifier</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARIdentifier();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('returntype')) {
                obj['returntype'] = ApiClient.convertToType(data['returntype'], 'String');
            }
            if (data.hasOwnProperty('prefix')) {
                obj['prefix'] = ApiClient.convertToType(data['prefix'], 'String');
            }
        }
        return obj;
    }


}

/**
 * User's FactSet account OR benchmark id.
 * @member {String} id
 */
SPARIdentifier.prototype['id'] = undefined;

/**
 * Account or benchmark return type.
 * @member {String} returntype
 */
SPARIdentifier.prototype['returntype'] = undefined;

/**
 * Account or benchmark prefix.
 * @member {String} prefix
 */
SPARIdentifier.prototype['prefix'] = undefined;






export default SPARIdentifier;

